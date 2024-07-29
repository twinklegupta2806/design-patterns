package design.patterns.structural.facade;

public class Video
{
    String name;
    public Video(String name){
        this.name = name;
    }

    public String toString(){
        return "Video Created with name "+ this.name;
    }
}
