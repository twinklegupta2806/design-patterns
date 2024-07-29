package design.patterns.creational.factory;

import java.util.Scanner;

public class Application
{
    public static void main(String[] args){
        System.out.println("Welcome to factory method");
        String operator;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ur operating system");
        operator = scanner.nextLine();
        operator="twinkle gupta";
        Dialog dialog;
        if(operator.equals("windows")){
            dialog = new WindowsDialog();
        }
        else {
            dialog = new WebDialog();
        }

        dialog.render();
    }
}
