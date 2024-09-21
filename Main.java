public class Main {
    public static void main(String[] args) {

        Screen screen;
        String input = "homePage";
        switch (input) {
            case "login":
                screen = new LoginScreen();
                break;
            case "homePage":
                screen = new HomePage();
                break;

            default:
                screen = new HomePage();
                break;
        }

        screen.onPressed();

    }
}
