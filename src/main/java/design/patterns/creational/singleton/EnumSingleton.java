package design.patterns.creational.singleton;

public enum EnumSingleton
{
    INSTANCE;

    public void doSomething(){
        System.out.println("doing something");
    }
}

// No, multiple instances are not getting created.
// In the case of an Enum Singleton, the INSTANCE is a single instance that is created by the JVM
// when the Enum class is loaded. When you call EnumSingleton.INSTANCE,
// you are always getting the same instance. The variable names enumSingleton,
// enumSingleton1, enumSingleton2, and enumSingleton3 are all pointing to the same instance.
// This is the key characteristic of the Singleton design pattern -
// ensuring that only one instance of the class exists in the JVM