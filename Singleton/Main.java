public class Main {
    public static void main(String[] args) {
        ThemeManager themeManager = ThemeManager.getInstance();

        System.out.println("Theme 1: " + themeManager.getTheme());

        themeManager.setTheme("Dark");

        ThemeManager themeManager2 = ThemeManager.getInstance();

        System.out.println("Theme 2" + themeManager2.getTheme());

    }
}
