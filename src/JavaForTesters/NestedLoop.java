package JavaForTesters;

import com.beust.ah.A;

import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {

        int NumOfStud = 5;
        int NumOfTest = 3;

        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<NumOfStud;i++){
            System.out.println("For Student "+(i+1));
            double marks = 0;
            double total =0;
            for(int j=0; j<NumOfTest; j++){
                System.out.println("Enter Marks For Test " +(j+1));
                marks = scanner.nextInt();
                total = total + marks;
            }
            double Average = total/NumOfTest;
            System.out.println("Average for Student "+(i+1)+" is "+Average);

        }

    }
}
