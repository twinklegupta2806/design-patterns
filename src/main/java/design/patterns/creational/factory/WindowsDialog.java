package design.patterns.creational.factory;

public class WindowsDialog extends Dialog
{
    @Override
    Button createButton()
    {
        return new WindowButton();
    }
}
