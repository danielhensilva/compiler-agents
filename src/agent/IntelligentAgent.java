package agent;

import communication.*;
import domain.*;
import environment.*;
import planner.*;
import utils.*;

public abstract class IntelligentAgent {

    private String identifier;

    private Environment environment;

    private List<Goal> goals;

    public IntelligentAgent(String identifier, Environment environment, List<Goal> goals) {
        this.identifier = identifier;
        this.environment = environment;
        this.goals = goals;

        this.raise();
    }

    // Situated
    protected abstract List<Percept> sensor(Environment environment);

    // Reactive & Proactive
    protected abstract List<Goal> refine(List<Percept> percepts, List<Goal> goals);

    // Flexible
    protected abstract List<Action> decide(List<Goal> goals);

    // Autonomous
    protected abstract void act(Environment environment, List<Action> actions);

    private void raise() {
        final Thread behavior =
            new Thread(() -> {
                // Execution cycle
                while (true)
                    execution();
            });
        behavior.start();
    }
    
    private void execution() {
        try {

            List<Percept> percepts = sensor(environment);
            goals = refine(percepts, goals);

            List<Action> actions = decide(goals);
            act(environment, actions);

        } catch (Exception exception) {
            // Robust
            System.out.println(exception.toString());
        }
    }

    public String toString() {
        return this.identifier;
    }
}
