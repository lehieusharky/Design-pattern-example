package command;

import reciever.Light;

public class LightOffCommand implements ICommand {
    Light light;

    LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }

}
