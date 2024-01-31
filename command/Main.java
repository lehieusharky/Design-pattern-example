import command.LightOnCommand;
import invoker.RemoteControl;
import reciever.Light;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        LightOnCommand lightOnCommand = new LightOnCommand(new Light());

        remote.setCommand(lightOnCommand);

        remote.onPressed();
    }
}