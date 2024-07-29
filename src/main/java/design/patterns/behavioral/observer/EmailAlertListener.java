package design.patterns.behavioral.observer;

public class EmailAlertListener implements EventListener
{
    String email;
    String message;

    EmailAlertListener(String email, String message){
        this.email = email;
        this.message = message;
    }

    @Override
    public void update(String message)
    {
        this.message = message;
    }

    public String toString(){
        return "The email = "+ email + " has this message stored = "+ message;
    }
}
