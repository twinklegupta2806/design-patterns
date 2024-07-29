package design.patterns.creational.prototype;

abstract class Shape
{
    int x, y;
    String color;

    public Shape(int x, int y){
        this.x=x;
        this.y=y;
    }

    public Shape(Shape source){
        this.x = source.x;
        this.y = source.y;
        this.color = source.color;
    }

    public abstract Shape clone();

    public String toString(){
        return "Shape is having x = "+ x + " y = "+y + " color = "+ color;
    }
}
