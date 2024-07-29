package design.patterns.behavioral.command;

public class CutCommand extends Command
{
    CutCommand(Application app, Editor editor)
    {
        super(app, editor);
    }

    @Override
    void execute()
    {
        backup = editor.text;
    }
}
