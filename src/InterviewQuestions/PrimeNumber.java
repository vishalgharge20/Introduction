package InterviewQuestions;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a Number to check Prime Number or Enter Quit to Exit: ");
            if (s.hasNextInt()) {
                int Num = s.nextInt();
                if (Num == 0 || Num == 1) {
                    System.out.println("Smallest Prime Number is 2, Please Enter other Number");
                }
                for (int i = 2; i < Num; i++) {
                    if (Num % i == 0) {
                        System.out.println("Not a Prime NUmber");
                    }
                    else {
                        System.out.println("It is a Prime NUmber");
                    }
                    break;
                }
            }
            else {
                String input = s.next();
                if (input.equalsIgnoreCase("quit")) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter an integer or type 'exit' to quit.");
                }

            }
        }


        s.close();
    }
}











