package design.patterns.behavioral.observer;

public class Editor
{
    public EventManager events;

    Editor(){
        this.events = new EventManager();
    }

    void openFile(String message){
        events.notifySubscribers("open", message);
    }

    void saveFile(String message){
        events.notifySubscribers("save", message);
    }
}
