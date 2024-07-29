package design.patterns.creational.abstractFactory;

public class MacFactory implements GUIFactory
{
    public MacButton createButton(){
        return new MacButton();
    }

    public MacCheckBox createCheckBox(){
        return new MacCheckBox();
    }
}
