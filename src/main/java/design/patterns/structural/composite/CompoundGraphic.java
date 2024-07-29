package design.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompoundGraphic implements Graphic
{
    List<Graphic> children = new ArrayList<>();

    public void add(Graphic g){
        children.add(g);
    }

    public void remove(Graphic g){
        children.remove(g);
    }

    @Override
    public void move(int x, int y)
    {
        for(Graphic child: children){
            child.move(x,y);
        }
    }

    @Override
    public void draw()
    {
        for(Graphic child: children){
            child.draw();
        }
    }
}
