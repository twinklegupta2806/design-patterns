package design.patterns.creational.singleton;

public class LazySingleton
{
    private static LazySingleton instance;
    private int count=0;
    private LazySingleton(){
        count++;
    }
    public static LazySingleton getInstance(){
        if(instance==null){
            instance=new LazySingleton();
        }
        System.out.println("instance has been created with number "+ instance.count);
        return instance;
    }
}
