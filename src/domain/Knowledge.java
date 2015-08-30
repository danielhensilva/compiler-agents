package domain;

import utils.*;

public class Knowledge {

    private String identifier;

    private List<String> requirement;

    private PairList<String, String> remember;

    private PairList<String, String> understand;

    private String description;

    public Knowledge(String identifier, String description) {
        this.identifier = identifier;
        this.description = description;
        this.requirement = new List<>();
        this.remember = new PairList<>();
        this.understand = new PairList<>();
    }

    public void addRequirement(String identifier) {
        this.requirement.add(identifier);
    }

    public void addRemember(String text, String identifier) {
        this.remember.add(text, identifier);
    }

    public void addUnderstand(String text, String identifier) {
        this.understand.add(text, identifier);
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public List<String> getRequirement() {
        return this.requirement;
    }

    public PairList<String, String> getRemember() {
        return this.remember;
    }

    public PairList<String, String> getUnderstand() {
        return this.understand;
    }

    public String getDescription() {
        return this.description;
    }

}
