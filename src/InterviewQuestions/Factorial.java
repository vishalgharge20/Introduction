package InterviewQuestions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a Number to get the Factorial or enter quit to Exit: ");
            if (scanner.hasNextInt()) {
                int Num = scanner.nextInt();
                if (Num == 0) {
                    System.out.println("1");
                }
                else {
                    int Factorial = 1;
                    for (int i = 1; i <= Num; i++) {
                    Factorial *= i;
                }
                System.out.println(Factorial);
                }
            }
            else {
                String input = scanner.next();
                if (input.equalsIgnoreCase("quit")) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter an integer or type 'quit' to Exit.");
                }

            }
        }
        scanner.close();


    }

}

