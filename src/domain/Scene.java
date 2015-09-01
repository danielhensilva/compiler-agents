package domain;

import utils.*;

public class Scene {

    private String identifier;

    private Boolean isStart;

    private Boolean isEnd;

    private String description;

    private List<String> knowledgeIdentifiers;

    public Scene(String identifier, String description, Boolean isStart, Boolean isEnd) {
        this.identifier = identifier;
        this.description = description;
        this.isStart = isStart;
        this.isEnd = isEnd;
        this.knowledgeIdentifiers = new List<>();
    }

    public void addKnowledgeIdentifier(String identifier) {
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

    public Boolean isStart() {
        return this.isStart;
    }

    public Boolean isEnd() {
        return this.isEnd;
    }

}
