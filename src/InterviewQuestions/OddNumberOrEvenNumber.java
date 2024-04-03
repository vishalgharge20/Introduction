package InterviewQuestions;

import java.util.Scanner;

public class OddNumberOrEvenNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        while (true) {
//            System.out.print("Enter the required number: ");
//            if (scanner.hasNextInt()) {
//                int numberSelected = scanner.nextInt();
//                if (numberSelected % 2 == 0) {
//                    System.out.println("This is an Even Number");
//                } else {
//                    System.out.println("This is an Odd Number");
//                }
//                break; // Exit the loop if the input is an integer
//            } else {
//                System.out.println("Invalid input. Please enter an integer.");
//                scanner.next(); // Consume the invalid input
//            }
//        }
//
//        scanner.close();
//    }
//}



        while (true) {
                System.out.print("Enter the required number (or type 'exit' to quit): ");
                if (scanner.hasNextInt()) {
                    int numberSelected = scanner.nextInt();
                    if (numberSelected % 2 == 0) {
                    System.out.println("This is an Even Number");
                    }
                    else {
                    System.out.println("This is an Odd Number");
                    }
                }
                else {
                    String input = scanner.next();
                    if (input.equalsIgnoreCase("exit")) {
                    break; // Exit the loop if the user types 'exit'
                    }
                else {
                    System.out.println("Invalid input. Please enter an integer or type 'exit' to quit.");
                 }
                }
                }

                scanner.close();
                }
                }




//        Code Explained :


//    while (true): This is an infinite loop. It will continue executing indefinitely until explicitly exited using a break statement.
//
//            System.out.print("Enter the required number (or type 'exit' to quit): "): This line prompts the user to enter a number or type 'exit' to quit the program.
//
//            if (scanner.hasNextInt()): This checks if the next input token is an integer.
//
//            int numberSelected = scanner.nextInt();: If the input is an integer, it reads the integer input from the user.
//
//            Even/Odd Check: Depending on whether the input is even or odd, the program prints an appropriate message.
//
//            else: If the input is not an integer, the program enters this block.
//
//            String input = scanner.next();: It reads the input as a string.
//
//            if (input.equalsIgnoreCase("exit")): It checks if the input is "exit" (case-insensitive).
//
//            break: If the user inputs "exit", the loop is exited, and the program terminates.
//
//            else: If the input is not "exit", it means the input is neither an integer nor "exit". In this case, the program displays an error message.
//
//            scanner.close();: This line closes the Scanner object to release system resources. It's important to close the Scanner when it's no longer needed to prevent resource leaks.
//
//            The multiple else statements are used to handle different scenarios:
//
//            One else block is for when the input is not an integer.
//            Another else block is nested within the first else block to handle the case when the input is neither an integer nor "exit".