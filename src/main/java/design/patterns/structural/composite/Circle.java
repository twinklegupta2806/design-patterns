package design.patterns.structural.composite;

public class Circle extends Dot
{
    int radius;

    public Circle (int x, int y, int radius) {
        super(x,y);
        this.radius = radius;
    }

    @Override
    public void draw()
    {
        System.out.println("The circle is drawn with radius = "+ radius + " and x = "+ x + " and y = "+ y);
    }
}
