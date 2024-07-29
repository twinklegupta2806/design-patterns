package design.patterns.structural.adapter;

public class SquarePegAdapter extends RoundPeg
{
    // does composition of se and extension of round peg
    public SquarePegAdapter(SquarePeg se){
        super((int) (se.width/(2*Math.sqrt(2))));
    }
}
