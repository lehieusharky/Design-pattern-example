package abstract_factory.Role;

import abstract_factory.Button.Button;
import abstract_factory.Button.BlueButton.CustomerBlueButton;
import abstract_factory.Button.RedButton.CustomerRedButton;

public class Customer extends RoleUser {

    @Override
    public Button createRedButton() {
        return new CustomerRedButton();
    }

    @Override
    public Button createBlueButton() {
        return new CustomerBlueButton();
    }

}
