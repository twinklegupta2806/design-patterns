package design.patterns.creational.factory;

public class WebButton implements Button
{
    @Override
    public void onClick()
    {
        System.out.println("Web Button has been clicked");
    }

    @Override
    public void render()
    {
        System.out.println("Web button has been rendered");
    }
}
