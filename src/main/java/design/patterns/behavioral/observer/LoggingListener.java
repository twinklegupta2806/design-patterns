package design.patterns.behavioral.observer;

public class LoggingListener implements EventListener
{
    private final String log;
    private String message;

    LoggingListener(String log, String message){
        this.log = log;
        this.message = message;
    }

    @Override
    public void update(String message)
    {
        this.message = message;
    }

    public String toString(){
        return "Logging Listener with log = "+ log + " has a message stored = "+ message;
    }
}
