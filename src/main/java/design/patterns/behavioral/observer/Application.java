package design.patterns.behavioral.observer;

public class Application
{
    public static void main(String[] args){
        Editor editor = new Editor();
        LoggingListener lg = new LoggingListener("cko logger", "legacy");
        EmailAlertListener eal = new EmailAlertListener("ord UMP message sender", "legacy");
        editor.events.subscribe( lg, "open");
        editor.events.subscribe( eal, "save");

        System.out.println(lg);
        System.out.println(eal);

        editor.openFile("hybrid cko");
        editor.saveFile("hybrid OTAPI");
    }
}
