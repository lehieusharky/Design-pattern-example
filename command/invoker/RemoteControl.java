package invoker;

import command.ICommand;

public class RemoteControl {
    ICommand command;

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void onPressed() {
        command.execute();
    }
}
