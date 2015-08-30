package domain;

import utils.*;

public class Scene {

    private String identifier;

    private String description;

    private List<String> knowledgeIdentifiers;

    public Scene(String identifier, String description) {
        this.identifier = identifier;
        this.description = description;
        this.knowledgeIdentifiers = new List<>();
    }

    public void addKnowledgeIdenfier(String identifier) {
        this.knowledgeIdentifiers.add(identifier);
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public String getDescription() {
        return this.description;
    }

    public List<String> getKnowledgeIdentifiers() {
        return this.knowledgeIdentifiers;
    }

}
