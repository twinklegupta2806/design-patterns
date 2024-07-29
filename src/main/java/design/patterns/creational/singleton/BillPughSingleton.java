package design.patterns.creational.singleton;

public class BillPughSingleton
{
    private int count=0;
    private BillPughSingleton() {count++;}

    private static class billPughSingletonHelper{
        static BillPughSingleton instance = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        BillPughSingleton ans = billPughSingletonHelper.instance;
        System.out.println("Instance of billpughsingleton helper has been created " + ans.count);
        return ans;
    }
}
