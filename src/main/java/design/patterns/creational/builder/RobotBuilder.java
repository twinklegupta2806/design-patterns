package design.patterns.creational.builder;

public class RobotBuilder implements Builder
{
    Robot r;
    @Override
    public void createBuilder(String name){
        this.r = new Robot();
        this.r.name=name;
        System.out.println("A new robot builder is created with name " + this.r.name );
    }

    @Override
    public void setArms()
    {
        this.r.arms=2;
        System.out.println("Robot got its arms");
    }

    @Override
    public void setHead()
    {
        this.r.head="big";
        System.out.println("Robot got its head");
    }

    @Override
    public void setLegs()
    {
        this.r.legs=2;
        System.out.println("Robot got its legs");
    }

    public Robot build(){
        return this.r;
    }
}
