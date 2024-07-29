package design.patterns.behavioral.strategy;

public class Client
{
    public static void main(String[] args){
        Context context= new Context();
        context.setStrategy(new ConcreteStrategyAdd());
        System.out.println(context.executeStrategy(5,6));
        context.setStrategy(new ConcreteStrategyMultiply());
        System.out.println(context.executeStrategy(3,4));
        context.setStrategy(new ConcreteStrategySubtract());
        System.out.println(context.executeStrategy(9,6));
    }
}
