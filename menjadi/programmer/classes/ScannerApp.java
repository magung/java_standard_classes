package menjadi.programmer.classes;

import java.util.Scanner;

public class ScannerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name : ");
        String name = scanner.nextLine();

        System.out.println("Hello " + name);

        System.out.print("Age : ");
        Integer age = scanner.nextInt();
        System.out.println("Your age " + age);

        System.out.print("Is Live : ");
        boolean live = scanner.nextBoolean();
        if(live)
            System.out.println("Your still live");
        else
            System.out.println("Your not live");
    }
    
}
