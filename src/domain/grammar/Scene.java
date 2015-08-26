package domain.grammar;

import utils.*;

public class Scene {

    private String description;

    private List<Knowledge> knowledge;

    public Scene() {

    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Knowledge> getKnowledge() {
        return this.knowledge;
    }

    public void setKnowledge(List<Knowledge> knowledge) {
        this.knowledge = knowledge;
    }

}
