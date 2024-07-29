package design.patterns.creational.singleton;

public class StaticBlockInitialization
{
    private int count = 0;
    private static final StaticBlockInitialization instance;
    static {
        try {
            instance  = new StaticBlockInitialization();
        }
       catch (Exception exp){
            throw new RuntimeException("karam is knjjjjrrrrr");
       }
    }

    private StaticBlockInitialization() {
        count++;
    }

    public static StaticBlockInitialization getInstance() {
        System.out.println("This instance will be created only once " + instance.count);
        return instance;
    }
}
