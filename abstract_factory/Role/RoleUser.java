package abstract_factory.Role;

import abstract_factory.Button.Button;

public abstract class RoleUser {

    public void onRedButtonClick() {
        Button button = createRedButton();
        button.onClick();

    }

    public void onBlueButtonClick() {
        Button button = createBlueButton();
        button.onClick();

    }

    public abstract Button createRedButton();

    public abstract Button createBlueButton();
}
