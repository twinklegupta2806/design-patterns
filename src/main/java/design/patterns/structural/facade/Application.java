package design.patterns.structural.facade;

public class Application
{
    public static void main(String[] args){
        // Now application does not know anything, rather it is just a layer which is communicating with facade layer
        System.out.println("Now we will get a video by sending a name and format of file ");
        System.out.println(new FacadeVideoConverter().convert("twinkle twinkle little staR", "mp4"));
    }
}
