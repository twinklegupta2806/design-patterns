package design.patterns.behavioral.strategy;

public class Context
{
    private Strategy strategy;

    void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    int executeStrategy(int a, int b){
        return strategy.execute(a,b);
    }
}
