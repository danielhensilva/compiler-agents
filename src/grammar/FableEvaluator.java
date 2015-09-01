package grammar;

import org.antlr.v4.runtime.tree.*;
import utils.*;
import domain.*;

public class FableEvaluator extends FableGrammarBaseVisitor<Object> {

    public FableEvaluator() {
    }

    @Override
    public Object visitDescription(FableGrammarParser.DescriptionContext ctx) {
        return ctx.String().toString().replace("\"", "");
    }

    @Override
    public Object visitRequirements(FableGrammarParser.RequirementsContext ctx) {
        List<String> identifiers = new List<>();

        if (ctx.Identifier() == null)
            return identifiers;

        for (TerminalNode node : ctx.Identifier())
            identifiers.add(node.toString());

        return identifiers;
    }

    @Override
    public Object visitRemember(FableGrammarParser.RememberContext ctx) {
        String identifier = ctx.Identifier().toString();
        String text = ctx.String().toString().replace("\"", "");
        return new Pair<String, String>(text, identifier);
    }

    @Override
    public Object visitUnderstand(FableGrammarParser.UnderstandContext ctx) {
        String identifier = ctx.Identifier().toString();
        String text = ctx.String().toString().replace("\"", "");
        return new Pair<String, String>(text, identifier);
    }

    @Override
    @SuppressWarnings("unchecked")
    public Object visitKnowledge(FableGrammarParser.KnowledgeContext ctx) {
        String identifier = ctx.Identifier().toString();
        String description = (String)this.visit(ctx.description());

        Knowledge knowledge = new Knowledge(identifier, description);

        if (ctx.requirements() != null) {
            List<String> requirements = (List<String>)this.visit(ctx.requirements());
            if (requirements != null) {
                for (String requirement : requirements)
                    knowledge.addRequirement(requirement);
            }
        }

        if (ctx.remember() != null) {
            for (FableGrammarParser.RememberContext rememberContext : ctx.remember()) {
                Pair<String, String> rememberPair = (Pair<String,String>)this.visit(rememberContext);
                if (rememberPair == null) continue;
                knowledge.addRemember(rememberPair.getLeft(), rememberPair.getRight());
            }
        }

        if (ctx.understand() != null) {
            for (FableGrammarParser.UnderstandContext understandContext : ctx.understand()) {
                Pair<String, String> understandPair = (Pair<String,String>)this.visit(understandContext);
                if (understandPair == null) continue;
                knowledge.addUnderstand(understandPair.getLeft(), understandPair.getRight());
            }
        }

        return knowledge;
    }

    @Override
    public Object visitAssociations(FableGrammarParser.AssociationsContext ctx) {
        List<String> identifiers = new List<>();

        for (TerminalNode node : ctx.Identifier())
            identifiers.add(node.toString());

        return identifiers;
    }

	@Override
    @SuppressWarnings("unchecked")
    public Object visitNormalScene(FableGrammarParser.NormalSceneContext ctx) {
        String identifier = ctx.Identifier().toString();
        String description = (String)this.visit(ctx.description());
        Boolean isStart = false;
        Boolean isEnd = true;

        Scene scene = new Scene(identifier, description, isStart, isEnd);

        if (ctx.associations() != null) {
            List<String> knowledgeIdentifiers = (List<String>)this.visit(ctx.associations());
            for (String knowledgeIdentifier : knowledgeIdentifiers)
                scene.addKnowledgeIdentifier(knowledgeIdentifier);
        }

        return scene;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Object visitStartScene(FableGrammarParser.StartSceneContext ctx) {
        String identifier = ctx.Identifier().toString();
        String description = (String)this.visit(ctx.description());
        Boolean isStart = true;
        Boolean isEnd = false;

        Scene scene = new Scene(identifier, description, isStart, isEnd);

        List<String> knowledgeIdentifiers = null;
        if (ctx.associations() != null)
             knowledgeIdentifiers = (List<String>)this.visit(ctx.associations());

        if (knowledgeIdentifiers != null)
            for (String knowledgeIdentifier : knowledgeIdentifiers)
                scene.addKnowledgeIdentifier(knowledgeIdentifier);

        return scene;
    }

    @Override
    public Object visitEndScene(FableGrammarParser.EndSceneContext ctx) {
        String identifier = ctx.Identifier().toString();
        String description = (String)this.visit(ctx.description());
        Boolean isStart = false;
        Boolean isEnd = true;

        Scene scene = new Scene(identifier, description, isStart, isEnd);

        return scene;
    }

    @Override
    public Object visitFable(FableGrammarParser.FableContext ctx) {

        String identifier = ctx.Identifier().toString();
        Fable fable = new Fable(identifier);

        for (FableGrammarParser.KnowledgeContext knowledgeContext : ctx.knowledge()) {
            Knowledge knowledge = (Knowledge)this.visit(knowledgeContext);
            fable.addKnowledge(knowledge);
        }

        for (FableGrammarParser.SceneContext sceneContext : ctx.scene()) {
            Scene scene = (Scene)this.visit(sceneContext);
            fable.addScene(scene);
        }

        return fable;
    }

}
