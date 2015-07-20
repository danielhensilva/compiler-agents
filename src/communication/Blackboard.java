package communication;

import domain.*;

public class Blackboard {

    private Story story;

    private Knowledge knowledge;

    private List<ObserverAgent> observers;

    public Blackboard() {
        this.story = new Story();
        this.observers = new List<>();
    }

    public void createNextStep() {
        this.story.createStep();
    }

    public void pushToKnowledge(Knowledge knowledge) {
        this.knowledge = knowledge;
    }

    public void pushToStory(Object object) {
        this.story.push(object);
    }

    public void addObserver(ObserverAgent observer) {
        this.observers.add(observer);
    }

    public void notifyEvent(EventType eventType) {
        for (ObserverAgent observer : this.observers)
            observer.notify(eventType);
    }

}
