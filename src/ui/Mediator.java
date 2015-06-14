package ui;

public class Mediator {

    private Form form;

    private Presenter presenter;

    public Mediator(Form form) {
        this.form = form;
        this.presenter = new Presenter(form);
    }

    public void notifyPresenter(EventType eventType) {
        this.presenter.raiseEvent(eventType);
    }
}
