package design.patterns;

import design.patterns.creational.singleton.BillPughSingleton;
import design.patterns.creational.singleton.DoubleCheckedLockingSingleton;
import design.patterns.creational.singleton.EagerSingleton;
import design.patterns.creational.singleton.EnumSingleton;
import design.patterns.creational.singleton.LazySingleton;
import design.patterns.creational.singleton.StaticBlockInitialization;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton3 = EagerSingleton.getInstance();

        LazySingleton lazySingleton = LazySingleton.getInstance();
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();
        LazySingleton lazySingleton3 = LazySingleton.getInstance();

        DoubleCheckedLockingSingleton doubleCheckedLockingSingleton = DoubleCheckedLockingSingleton.getInstance();
        DoubleCheckedLockingSingleton doubleCheckedLockingSingleton1 = DoubleCheckedLockingSingleton.getInstance();
        DoubleCheckedLockingSingleton doubleCheckedLockingSingleton2 = DoubleCheckedLockingSingleton.getInstance();
        DoubleCheckedLockingSingleton doubleCheckedLockingSingleton3 = DoubleCheckedLockingSingleton.getInstance();

        BillPughSingleton billPughSingleton = BillPughSingleton.getInstance();
        BillPughSingleton billPughSingleton1 = BillPughSingleton.getInstance();
        BillPughSingleton billPughSingleton2 = BillPughSingleton.getInstance();
        BillPughSingleton billPughSingleton3 = BillPughSingleton.getInstance();

        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        enumSingleton.doSomething();
        EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE;
        enumSingleton1.doSomething();
        EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE;
        enumSingleton2.doSomething();
        EnumSingleton enumSingleton3 = EnumSingleton.INSTANCE;
        enumSingleton3.doSomething();

        StaticBlockInitialization staticBlockInitialization = StaticBlockInitialization.getInstance();
        StaticBlockInitialization staticBlockInitialization1 = StaticBlockInitialization.getInstance();
        StaticBlockInitialization staticBlockInitialization2 = StaticBlockInitialization.getInstance();
        StaticBlockInitialization staticBlockInitialization3 = StaticBlockInitialization.getInstance();
    }
}