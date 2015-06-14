package ui;

public class Presenter {

    private View view;

    public Presenter(View view) {
        this.view = view;
    }

    public void raiseEvent(EventType eventType) {
        switch (eventType) {
            case GenerateTale:
                this.generateTale();
                break;
        }
    }

    private void generateTale() {
        System.out.println("generateTale");
    }
}
