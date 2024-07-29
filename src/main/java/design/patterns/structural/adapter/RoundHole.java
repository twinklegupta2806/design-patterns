package design.patterns.structural.adapter;

public class RoundHole
{
    int radius;

    public RoundHole(int radius){
        this.radius = radius;
    }

    public int getRadius(){
        return radius;
    }

    boolean fits(RoundPeg r){
        return r.getRadius() <= this.getRadius();
    }
}
