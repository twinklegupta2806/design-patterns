package design.patterns.behavioral.template;

public class OrcsAI extends GameAI
{
    @Override
    void buildStructures()
    {
        System.out.println("building structure for orks");
    }

    @Override
    void buildUnits()
    {
        System.out.println("building units for orks");
    }

    @Override
    void sendScouts(int position)
    {
        System.out.println("orks scout is at position = "+ position);
    }

    @Override
    void sendWarriors(int position)
    {
        System.out.println("orks warior is sent at postion = "+ position);
    }
}
