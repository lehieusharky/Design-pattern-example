/**
 * ThemeManager
 */
public class ThemeManager {
    private static ThemeManager themeManager;

    private String theme;

    private ThemeManager() {
        this.theme = "Light";
    }

    public static ThemeManager getInstance() {
        if (themeManager == null) {
            // multi thread => sync solution
            synchronized (ThemeManager.class) {
                if (themeManager == null) {
                    themeManager = new ThemeManager();
                }
            }
        }
        return themeManager;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }
}