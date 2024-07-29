package design.patterns.behavioral.command;

public class UndoCommand extends Command
{
    UndoCommand(Application app, Editor editor)
    {
        super(app, editor);
    }

    @Override
    void execute()
    {
        this.undo();
    }
}
