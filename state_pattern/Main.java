package state_pattern;

import state_pattern.context.PersonContext;
import state_pattern.state.AdultState;
import state_pattern.state.KindergartenState;
import state_pattern.state.YoungState;

public class Main {
    public static void main(String[] args) {
        PersonContext personContext = new PersonContext(new KindergartenState());

        personContext.doThis();

        personContext.changeState(new YoungState());

        personContext.doThis();

        personContext.changeState(new AdultState());

        personContext.doThis();
    }
}
