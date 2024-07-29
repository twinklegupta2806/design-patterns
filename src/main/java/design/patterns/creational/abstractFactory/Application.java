package design.patterns.creational.abstractFactory;

import java.util.Scanner;

public class Application
{
    public static void main(String[] args){
        System.out.println("hello everyone, welcome to abstract factory");
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter the type of OS you operate your system on");
        String typeOfOS= sc.nextLine();
        GUIFactory gui;
        if(typeOfOS.equals("mac"))
            gui= new MacFactory();
        else
            gui = new WindowFactory();

        gui.createButton().paint();
        gui.createCheckBox().select();
    }
}
