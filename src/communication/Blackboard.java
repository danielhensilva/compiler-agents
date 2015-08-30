package communication;

import utils.*;

public class Blackboard {

    private List<Fragment> fable;

    private List<Event> events;

    public Blackboard() {
        this.fable = new List<>();
        this.events = new List<>();
    }

    public void addFragment(Fragment fragment) {
        this.fable.add(fragment);
    }

    public void pushEvent(EventType type) {
        Event event = new Event(type);
        this.events.add(event);
    }

    public Event popEvent(EventType type) {
        for (Event event : this.events)
            if (type == event.getType()) {
                this.events.remove(event);
                return event;
            }
        return null;
    }

}
