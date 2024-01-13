public abstract class Screen {
    public void onPressed() {
        final Button button = createButton();
        button.onPressed();
    }

    public abstract Button createButton();

}
