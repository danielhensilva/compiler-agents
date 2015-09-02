package agent;

import communication.*;
import domain.*;
import grammar.*;
import planner.*;
import utils.*;

public class MaestroAgent extends IntelligentAgent {

    public MaestroAgent() {
    }

    @Override
    public void initializeState(List<Intention> intentions) {

    }

    @Override
    public List<Belief> sensorate(Blackboard blackboard) {
        Event event = blackboard.popEvent(EventType.Maestro);

        if (event == null)
            return new List<Belief>();

        return null;
    }

    @Override
    public List<Desire> deliberate(List<Belief> beliefs) {
        return null;
    }

    @Override
    public List<Intention> plan(List<Desire> desires) {
        return null;
    }

    @Override
    public void execute(List<Intention> intentions) {
    }

}
