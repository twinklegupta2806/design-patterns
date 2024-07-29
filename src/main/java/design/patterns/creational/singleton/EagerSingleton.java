package design.patterns.creational.singleton;

public class EagerSingleton
{
    private int count = 0;
    private static final EagerSingleton instance = new EagerSingleton();
    private EagerSingleton() {
        count++;
    }

    public static EagerSingleton getInstance(){
        System.out.println("This instance will be created only once " + instance.count);
        return instance;
    }
}


// the getInstance is static and instance is static, so that multiple instances of them are not created and can be accessed globally