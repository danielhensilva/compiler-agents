package communication;

import domain.*;

public class Blackboard {

    private Story story;

    private List<ObserverAgent> observers;


    public Blackboard() {
        this.story = new Story();
        this.observers = new List<>();
    }

    public void createNextStep() {
        this.story.createStep();
    }

    public void pushKnowledgeBase() {
    }

    public void pushObjective(Objective objective) {
        this.story.getCurrentStep().setObjective(objective);
    }

    public void pushConflict(Conlict conflict) {
        this.story.getCurrentStep().setOConflict(conflict);
    }

    public void pushCatastrophe(Catastrophe catastrophe) {
        this.story.getCurrentStep().setCatastrophe(catastrophe);
    }

    public void pushReaction(Objective objective) {
        this.story.getCurrentStep().setObjective(objective);
    }

    public void pushDilemma(Objective objective) {
        this.story.getCurrentStep().setObjective(objective);
    }

    public void pushDecision(Objective objective) {
        this.story.getCurrentStep().setObjective(objective);
    }

    public void addObserver(ObserverAgent observer) {
        this.observers.add(observer);
    }

    public void notifyEvent(EventType eventType) {
        for (ObserverAgent observer : this.observers)
            observer.notify(eventType);
    }

}
