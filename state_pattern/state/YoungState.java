package state_pattern.state;

public class YoungState implements IPersonState {

    @Override
    public void doThis() {
        System.out.println("Go to hight school");
    }

}
