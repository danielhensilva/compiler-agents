package grammar;

import org.antlr.v4.runtime.tree.*;
import utilitarios.*;
import dominio.*;

public class FableEvaluator extends FableGrammarBaseVisitor<Object> {

    public FableEvaluator() {
    }

    @Override
    public Object visitDescricao(FableGrammarParser.DescricaoContext ctx) {
        return ctx.String().toString().replace("\"", "");
    }

    @Override
    public Object visitRequisitos(FableGrammarParser.RequisitosContext ctx) {
        List<String> identificadores = new List<>();

        if (ctx.Identificador() == null)
            return identificadores;

        for (TerminalNode node : ctx.Identificador())
            identificadores.add(node.toString());

        return identificadores;
    }

    @Override
    public Object visitLembranca(FableGrammarParser.LembrancaContext ctx) {
        String identificador = ctx.Identificador().toString();
        String texto = ctx.String().toString().replace("\"", "");
        return new Pair<String, String>(texto, identificador);
    }

    @Override
    public Object visitEntendimento(FableGrammarParser.EntendimentoContext ctx) {
        String identificador = ctx.Identificador().toString();
        String texto = ctx.String().toString().replace("\"", "");
        return new Pair<String, String>(texto, identificador);
    }

    @Override
    @SuppressWarnings("unchecked")
    public Object visitConhecimento(FableGrammarParser.ConhecimentoContext ctx) {
        String identificador = ctx.Identificador().toString();
        String descricao = (String)this.visit(ctx.descricao());

        Conhecimento conhecimento = new Conhecimento(identificador, descricao);

        if (ctx.requisitos() != null) {
            List<String> requisitos = (List<String>)this.visit(ctx.requisitos());
            if (requisitos != null) {
                for (String requisito : requisitos)
                    conhecimento.adicionarRequisito(requisito);
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

        for (TerminalNode node : ctx.Identificador())
            identifiers.add(node.toString());

        return identifiers;
    }

	@Override
    @SuppressWarnings("unchecked")
    public Object visitNormalScene(FableGrammarParser.NormalSceneContext ctx) {
        String identifier = ctx.Identificador().toString();
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
        String identifier = ctx.Identificador().toString();
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
        String identifier = ctx.Identificador().toString();
        String description = (String)this.visit(ctx.description());
        Boolean isStart = false;
        Boolean isEnd = true;

        Scene scene = new Scene(identifier, description, isStart, isEnd);

        return scene;
    }

    @Override
    public Object visitFable(FableGrammarParser.FableContext ctx) {

        String identifier = ctx.Identificador().toString();
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
