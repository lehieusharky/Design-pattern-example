package state_pattern.state;

public class KindergartenState implements IPersonState {

    @Override
    public void doThis() {
        System.out.println("Go to nursery school");
    }

}
