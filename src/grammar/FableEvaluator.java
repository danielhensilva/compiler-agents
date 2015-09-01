package grammar;

import utils.*;
import domain.*;

public class FableEvaluator extends FableGrammarBaseVisitor<Object> {

    private Fable fable;

    public FableEvaluator() {
    }

    public Fable getFable() {
        return this.fable;
    }

    @Override
    public Object visitDescription(FableGrammarParser.DescriptionContext ctx) {
        System.out.println("visitDescription -> " + ctx.getText());
        return visitChildren(ctx);
    }

    @Override
    public Object visitRequirements(FableGrammarParser.RequirementsContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitRemember(FableGrammarParser.RememberContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitUnderstand(FableGrammarParser.UnderstandContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitKnowledge(FableGrammarParser.KnowledgeContext ctx) {
        System.out.println(ctx.Identifier());
        return visitChildren(ctx);
    }

    @Override
    public Object visitAssociations(FableGrammarParser.AssociationsContext ctx) {
        return visitChildren(ctx);
    }

	@Override
    public Object visitNormalScene(FableGrammarParser.NormalSceneContext ctx) {
        System.out.println(ctx.Identifier());
        return visitChildren(ctx);
    }

    @Override
    public Object visitStartScene(FableGrammarParser.StartSceneContext ctx) {
        System.out.println(ctx.Identifier());
        return visitChildren(ctx);
    }

    @Override
    public Object visitEndScene(FableGrammarParser.EndSceneContext ctx) {
        System.out.println(ctx.Identifier());
        return visitChildren(ctx);
    }

    @Override
    public Object visitFable(FableGrammarParser.FableContext ctx) {
        System.out.println(ctx.Identifier());
        return visitChildren(ctx);
    }

}
