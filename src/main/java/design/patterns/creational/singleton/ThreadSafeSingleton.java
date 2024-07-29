package design.patterns.creational.singleton;

public class ThreadSafeSingleton
{
    ThreadSafeSingleton() {}
    public static ThreadSafeSingleton instance;
    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance==null)
            instance=new ThreadSafeSingleton();

        return instance;
    }
}

// make it static so that multiple instances of same class couldn't be created
// make it synchronized that multiple threads don't create multiple instances