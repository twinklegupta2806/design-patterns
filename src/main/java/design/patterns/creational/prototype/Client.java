package design.patterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Client
{
    public static void main(String[] args) {
        System.out.println("lets use prototype to create clones of shapes");

        Shape c1 = new Circle(4,5,"red");
        Shape c2= c1.clone();
        Shape r1= new Rectangle(3,6, "yellow");
        Shape r2= r1.clone();

        List<Shape> shapes = new ArrayList<>();
        shapes.add(c1);
        shapes.add(c2);
        shapes.add(r1);
        shapes.add(r2);

        for(Shape shape: shapes){
            System.out.println(shape);
        }
    }
}
