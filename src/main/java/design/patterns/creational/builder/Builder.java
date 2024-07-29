package design.patterns.creational.builder;

public interface Builder
{
    void createBuilder(String name);
    void setArms();
    void setLegs();
    void setHead();
}
