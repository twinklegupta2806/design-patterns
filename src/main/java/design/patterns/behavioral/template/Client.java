package design.patterns.behavioral.template;

public class Client
{
    public static void main(String[] args){
        MonstorAI monstorAI = new MonstorAI();


        OrcsAI orcsAI = new OrcsAI();
        System.out.println("ORKS turn ");
        orcsAI.turn(0);

        System.out.println("Monstor turn ");
        monstorAI.turn(0);
    }
}
