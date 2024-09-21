package state_pattern.context;

import state_pattern.state.IPersonState;

public class PersonContext {
    private IPersonState state;

    public PersonContext(IPersonState initState) {
        state = initState;
    }

    public void changeState(IPersonState newState) {
        state = newState;
    }

    public void doThis() {
        state.doThis();
    }
}
