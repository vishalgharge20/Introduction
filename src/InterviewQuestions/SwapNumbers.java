package InterviewQuestions;
import java.util.Scanner;
public class SwapNumbers {
    public static void main(String[] args) throws InterruptedException {

        while (true) {
                Scanner scanner = new Scanner(System.in);
                // Taking inputs

                System.out.println("Enter the first number: ");
                int firstNum = scanner.nextInt();

                System.out.println("Enter the second number: ");
                int secondNum = scanner.nextInt();

                System.out.println("You Entered First Num as " + firstNum);
                System.out.println("You Entered Second Num as " + secondNum);

                System.out.println("Swapping in progress");
                Thread.sleep(10000);

                // swapping
                firstNum = firstNum + secondNum;
                secondNum = firstNum - secondNum;
                firstNum = firstNum - secondNum;

                System.out.println("First Num is: " + firstNum);
                System.out.println("Second Num is: " + secondNum);

            }












    }
}
