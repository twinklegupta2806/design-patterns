package design.patterns.structural.adapter;

public class Client
{
    public static void main(String[] args){
        RoundHole rh = new RoundHole(5);
        RoundPeg re = new RoundPeg(4);
        SquarePeg se = new SquarePeg(30);
        System.out.println("peg fits in the hole = "+rh.fits(re));
        // error statement: System.out.println("peg fits in the hole = "+rh.fits(se));
        System.out.println("lets see square peg fits or not "+ rh.fits(new SquarePegAdapter(se)));
    }
}
