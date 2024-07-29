package design.patterns.structural.composite;

public class ImageEditor
{
    public static void main(String[] args){
        CompoundGraphic cg = new CompoundGraphic();
        cg.add(new Circle(5,6,4));
        cg.add(new Dot(2,3));

        cg.move(4,5);
        cg.draw();
    }
}
