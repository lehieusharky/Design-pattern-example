package abstract_factory;

import abstract_factory.Role.Admin;
import abstract_factory.Role.Customer;
import abstract_factory.Role.RoleUser;

public class Main {

    public static void main(String[] args) {
        RoleUser user = new Admin();
        user.onBlueButtonClick();
        user.onRedButtonClick();

        user = new Customer();

        user.onBlueButtonClick();
        user.onRedButtonClick();
    }
}