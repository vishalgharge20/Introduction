package JavaForTesters;

import java.util.Scanner;


public class Methods {
    static String name;
    static int age;


    public static void main(String[] args) {
        System.out.println("What is your name:");
        Scanner scanner = new Scanner(System.in);
        name = scanner.next();
        greetUser(name);
        System.out.println("what is your age?");
        age = scanner.nextInt();
        ageIs(age);

    }

    public static void greetUser(String name){
        System.out.println("Hi "+name+" Good Morning");
    }

    public static void ageIs(int age){
        System.out.println(name+"'s Age is "+age );

    }

}
