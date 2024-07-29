package design.patterns.behavioral.template;

abstract public class GameAI
{
    void turn(int position){
        collectResources();
        buildStructures();
        buildUnits();
        attack(position);
    }

    void collectResources(){
        System.out.println("collecting common resources");
    }

    abstract void buildStructures();

    abstract void buildUnits();

    void attack(int position){
        sendWarriors(position);
        sendScouts(position);
    }

    abstract void sendScouts(int position);

    abstract void sendWarriors(int position);
}
