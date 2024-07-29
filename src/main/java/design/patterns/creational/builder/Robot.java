package design.patterns.creational.builder;

public class Robot
{
    String name;
    int legs;
    int arms;
    String head;

    public String toString(){
        return "Robot has name " + name + " arms = "+ arms + " legs= "+ legs + " head = "+ head;
    }
}
