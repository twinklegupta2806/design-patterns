package design.patterns.behavioral.command;

public abstract class Command
{
    Application app;
    Editor editor;
    static String backup;

    Command(Application app, Editor editor){
        this.app = app;
        this.editor = editor;
    }

    void undo(){
        editor.text = backup;
    }

    abstract void execute();
}
