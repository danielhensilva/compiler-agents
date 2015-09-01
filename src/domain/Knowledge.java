package domain;

import utils.*;

public class Knowledge {

    private String identifier;

    private List<String> requirementCollection;

    private PairList<String, String> rememberCollection;

    private PairList<String, String> understandCollection;

    private String description;

    public Knowledge(String identifier, String description) {
        this.identifier = identifier;
        this.description = description;
        this.requirementCollection = new List<>();
        this.rememberCollection = new PairList<>();
        this.understandCollection = new PairList<>();
    }

    public void addRequirement(String identifier) {
        this.requirementCollection.add(identifier);
    }

    public void addRemember(String text, String identifier) {
        this.rememberCollection.add(text, identifier);
    }

    public void addUnderstand(String text, String identifier) {
        this.understandCollection.add(text, identifier);
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public List<String> getRequirementCollection() {
        return this.requirementCollection;
    }

    public PairList<String, String> getRememberCollection() {
        return this.rememberCollection;
    }

    public PairList<String, String> getUnderstandCollection() {
        return this.understandCollection;
    }

    public String getDescription() {
        return this.description;
    }

}
