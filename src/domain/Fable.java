package domain;

import utils.*;

public class Fable {

    private String identifier;

    private List<Knowledge> knowledgeCollection;

    private List<Scene> sceneCollection;

    public Fable(String identifier) {
        this.identifier = identifier;
        this.knowledgeCollection = new List<>();
        this.sceneCollection = new List<>();
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public void addKnowledge(Knowledge knowledge) {
        this.knowledgeCollection.add(knowledge);
    }

    public void addScene(Scene scene) {
        this.sceneCollection.add(scene);
    }

    public List<Knowledge> getKnowledgeCollection() {
        return this.knowledgeCollection;
    }

    public List<Scene> getSceneCollection() {
        return this.sceneCollection;
    }

    public Scene getStartScene() {
        for (Scene scene : this.sceneCollection)
            if (scene.isStart())
                return scene;

        return null;
    }

    public Scene getEndScene() {
        for (Scene scene : this.sceneCollection)
            if (scene.isEnd())
                return scene;

        return null;
    }

}
