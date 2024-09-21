package state_pattern.state;

public class AdultState implements IPersonState {

    @Override
    public void doThis() {
        System.out.println("Go to university or work");
    }

}
