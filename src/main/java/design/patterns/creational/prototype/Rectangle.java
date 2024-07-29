package design.patterns.creational.prototype;

public class Rectangle extends Shape
{
    public Rectangle(int x, int y, String color){
        super(x,y);
        this.color = color;
    }

    public Rectangle(Rectangle r){
        super(r.x, r.y);
        this.color = r.color;
    }

    public Rectangle clone(){
        return new Rectangle(this);
    }
}
