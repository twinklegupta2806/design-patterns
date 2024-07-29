package design.patterns.creational.singleton;

public class DoubleCheckedLockingSingleton
{
    private static DoubleCheckedLockingSingleton instance;
    private int count=0;
    private DoubleCheckedLockingSingleton() { count++; }
    public static DoubleCheckedLockingSingleton getInstance() {
        if(instance==null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                if(instance==null)
                    instance = new DoubleCheckedLockingSingleton();
            }
        }
        System.out.println("instance of double checked locking created "+ instance.count);
        return instance;
    }
}
