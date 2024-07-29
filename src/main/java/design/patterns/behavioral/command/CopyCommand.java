package design.patterns.behavioral.command;

public class CopyCommand extends Command
{
    CopyCommand(Application app, Editor editor)
    {
        super(app, editor);
    }

    @Override
    void execute()
    {
        System.out.println("backup1 = "+ backup);
        System.out.println("backup2 = "+ backup);
        backup = app.clipboard;
        System.out.println("backup3 = "+ backup);
    }
}
