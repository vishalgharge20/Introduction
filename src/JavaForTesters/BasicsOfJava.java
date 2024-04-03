package JavaForTesters;

/*
import java.util.Scanner;

public class BasicsOfJava {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        String decision ="yes";

        while (true){
            if (decision.equalsIgnoreCase("No")){
                System.out.println("Thank you for using our Calculator");
                break;
            }
            if (!decision.equalsIgnoreCase("yes")){
                System.out.println("Invalid Input");
                break;
            }
            else {
                System.out.println("Enter the first number that you want to add");
                while (true){
                    if (scanner.hasNextDouble()) {
                        num1 = scanner.nextDouble();
                        break;
                    }
                    else {
                        System.out.println("Enter a valid Number");
                        scanner.next();
                    }
                }

                System.out.println("Enter the Second number that you want to add");
                while(true) {
                    if (scanner.hasNextDouble()) {
                        num2 = scanner.nextDouble();
                        break;
                    }
                    else {
                        System.out.println("Enter a valid Number");
                        scanner.next();
                    }
                }

                double sum = num1 + num2;
                System.out.println("Sum of both the Numbers is: "+sum);

                System.out.println("Do you want to add more Numbers? Press \"Yes\" or \"NO\"");
                decision = scanner.next();
            }

        }



        }
    }
 */



// USING DO WHILE LOOP

import java.util.Scanner;

public class BasicsOfJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1;
        double num2;
        String decision;


        do {
            do {
                System.out.println("Enter the first number that you want to add");
                if (scanner.hasNextDouble()) {
                    num1 = scanner.nextDouble();
                    break;
                }
                else {
                    System.out.println("Enter a valid Number");
                    scanner.next();
                }
            }while (true);

            do {
                System.out.println("Enter the Second number that you want to add");
                if (scanner.hasNextDouble()) {
                    num2 = scanner.nextDouble();
                    break;
                }
                else {
                    System.out.println("Enter a valid Number");
                    scanner.next();
                }
            }while (true);

            double sum = num1 + num2;
                   System.out.println("Sum of both the Numbers is: "+sum);

                   System.out.println("Do you want to add more Numbers? Press \"Yes\" or \"NO\"");
                   decision = scanner.next();

                   if(decision.equalsIgnoreCase("no")){
                       System.out.println("Thank you for using our Calculator");
                   }
                   else {
                       System.out.println("Invalid Input");
                   }
        }while (decision.equalsIgnoreCase("yes"));

    }
}
















