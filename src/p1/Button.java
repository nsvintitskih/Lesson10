package p1;

public class Button {

    EventHandler handler;

    public Button(EventHandler handler) {
        this.handler = handler;
    }

    public void click(){
        handler.execute();
    }
}
