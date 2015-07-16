package agent;

import communication.*;
import domain.*;
import environment.*;
import planner.*;
import utils.*;

public abstract class IntelligentAgent {

    /*
    BDI-interpreter
    ---------------
    initialize-state();
    repeat
        options := option-generator(event-queue);
        selected-options := deliberate(options);
        update-intentions(selected-options);
        execute();
        get-new-external-events();
        drop-successful-attitudes();
        drop-impossible-attitudes();
    end repeat
    */

    public IntelligentAgent() {

    }

    public void inializeState() {

    }

    public List<Option> generateOptions(Percepts percept) {

    }

    public List<SelectedOption> deliberate(List<Option> options) {

    }

    public void Execute() {

    }

    public List<Percepts> getNewExternalPercepts() {

    }

    public void DropSucessfulAttitudes() {

    }

    public void DropImpossibleAttitudes() {

    }
    
}
