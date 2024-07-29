package design.patterns.creational.builder;

public class Client
{
    public static void main(String[] args){
        RobotBuilder rb= new RobotBuilder();
        rb.createBuilder("aman");
        rb.setArms();
        rb.setLegs();
        rb.setHead();
        // here aman robot looses its scope as it can't acceessed, but what if r is private,
        // secondly this violates the principle of encapsulation
        Robot aman= rb.r;
        System.out.println(aman);

        // so better way is below to use build method
        aman = rb.build();
        System.out.println(aman);

        RobotBuilder rb1= new RobotBuilder();
        rb1.createBuilder("abbu");
        rb1.setArms();
        rb1.setLegs();
        rb1.setHead();
        Robot abbu = rb1.r;
        System.out.println(abbu);
        abbu = rb1.build();
        System.out.println(abbu);
    }
}
