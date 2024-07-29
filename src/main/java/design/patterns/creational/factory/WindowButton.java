package design.patterns.creational.factory;

public class WindowButton implements Button
{
    @Override
    public void onClick()
    {
        System.out.println("window button has been clicked");
    }

    @Override
    public void render()
    {
        System.out.println("Window button has been rendered");
    }
}
