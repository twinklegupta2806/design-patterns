package design.patterns.behavioral.command;

public class PasteCommand extends Command
{
    PasteCommand(Application app, Editor editor)
    {
        super(app, editor);
    }

    @Override
    void execute()
    {
        System.out.println("backup1 = "+ backup);
        System.out.println("backup2 = "+ backup);
        this.editor.replaceSelection(backup);
        System.out.println("backup3 = "+ backup);
    }
}
