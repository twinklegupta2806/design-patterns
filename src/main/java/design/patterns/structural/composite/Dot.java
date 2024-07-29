package design.patterns.structural.composite;

public class Dot implements Graphic
{
    int x, y;

    public Dot(int x, int y){
        this.x =x;
        this.y =y;
    }

    @Override
    public void move(int x, int y)
    {
        System.out.println("The x and y coordinates have moved by 1 having values as "+ this.x+ " and "+this.y);
        this.x+=x; this.y+=y;
        System.out.println("The x and y coordinates have moved by 1 having values as "+ this.x+ " and "+this.y);
    }

    @Override
    public void draw()
    {
        System.out.println("Dot is drawn at corrdinates x = "+ x + " and y= "+ y);
    }
}
