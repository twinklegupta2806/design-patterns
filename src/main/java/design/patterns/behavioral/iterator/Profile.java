package design.patterns.behavioral.iterator;

public class Profile
{
    String name;
    String companyName;

    Profile(String name, String companyName){
        this.name = name;
        this.companyName = companyName;
    }

    public String toString(){
        return "Profile name = "+ name + " and has company = "+ companyName;
    }
}
