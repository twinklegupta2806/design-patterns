package design.patterns.creational.prototype;

public class Circle extends Shape
{
    public Circle(int x, int y, String color){
        super(x, y);
        this.color = color;
    }

    public Circle(Circle c){
        super(c.x, c.y);
        this.color = c.color;
    }
    @Override
    public Circle clone()
    {
        return new Circle(this);
    }
}
