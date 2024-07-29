package design.patterns.behavioral.command;

public class Application
{
    static String clipboard;
    public static void main(String[] args){

        Editor activeEditor;
        CommandHistory history = new CommandHistory();
        activeEditor = new Editor();


        Application app = new Application();
        clipboard= "hello myself tom spencer";
        Command c2 = new CopyCommand(app, activeEditor);
        c2.execute();
        Command c1= new PasteCommand(app, activeEditor);
        history.push(c1);
        c1.execute();

        System.out.println(activeEditor.text);

        clipboard = "myself twinkle gupta";
//        Command c2 = new CopyCommand(app, activeEditor, activeEditor.text);
//        c2.execute();
        c2.execute();
        System.out.println(activeEditor.text);

        c1.execute();
        System.out.println(activeEditor.text);

        Command c3 = new CutCommand(app, activeEditor);
        c3.execute();
        System.out.println(activeEditor.text);

        clipboard = "Baaanaa bansal";
        c2.execute();
        c1.execute();
        System.out.println(activeEditor.text);

        clipboard = "Kausha Rani";
        c1.execute();
        System.out.println(activeEditor.text);

        Command c4 = new UndoCommand(app, activeEditor);
        c4.execute();
        System.out.println(activeEditor.text);
    }
}
