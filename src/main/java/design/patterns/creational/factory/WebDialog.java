package design.patterns.creational.factory;

public class WebDialog extends Dialog
{
    @Override
    Button createButton()
    {
        return new WebButton();
    }
}
