package design.patterns.creational.abstractFactory;

public class WindowFactory implements GUIFactory
{
    public WindowCheckBox createCheckBox(){
        return new WindowCheckBox();
    }

    public WindowButton createButton(){
        return new WindowButton();
    }
}
