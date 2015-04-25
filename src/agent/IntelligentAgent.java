package agent;
import environment.*;
import java.util.ArrayList;

public abstract class IntelligentAgent {

    private String identifier;

    private Environment environment;

    private ArrayList<AgentGoal> goals;

    public IntelligentAgent(String identifier, Environment environment, ArrayList<AgentGoal> goals) {
        this.identifier = identifier;
        this.environment = environment;
        this.goals = goals;

        this.raise();
    }

    // Situated
    protected abstract ArrayList<Percept> sensor(Environment environment);

    // Reactive & Proactive
    protected abstract ArrayList<AgentGoal> refine(ArrayList<Percept> percepts, ArrayList<AgentGoal> goals);

    // Flexible
    protected abstract ArrayList<AgentAction> decide(ArrayList<AgentGoal> goals);

    // Autonomous
    protected abstract void act(Environment environment, ArrayList<AgentAction> actions);

    private void raise() {
        final Thread behavior =
            new Thread(
                new Runnable() {
                    public void run() {
                        while(true) {
                            try {

                                ArrayList<Percept> percepts = sensor(environment);
                                goals = refine(percepts, goals);

                                ArrayList<AgentAction> actions = decide(goals);
                                act(environment, actions);

                            } catch (Exception exception) {
                                System.out.println(exception.toString());
                                // Robust
                            }
                        }
                    }
                }
            );

        behavior.start();
    }

    public String toString() {
        return this.identifier;
    }
}
