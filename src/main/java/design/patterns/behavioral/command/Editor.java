package design.patterns.behavioral.command;

public class Editor
{
    String text;

    String getSelection() {
        return text;
    }

    void deleteSelection() {
        text="";
    }

    void replaceSelection(String text) {
        this.text = text;
    }
}
