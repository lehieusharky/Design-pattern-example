package abstract_factory.Role;

import abstract_factory.Button.Button;
import abstract_factory.Button.BlueButton.AdminBlueButton;
import abstract_factory.Button.RedButton.AdminRedButon;

public class Admin extends RoleUser {

    @Override
    public Button createRedButton() {
        return new AdminRedButon();
    }

    @Override
    public Button createBlueButton() {
        return new AdminBlueButton();
    }

}
