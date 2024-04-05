package JavaForTesters;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayGrades {

    public static int[] grades;
    public static Scanner scanner = new Scanner(System.in);
    public static int numberOfGrades;

    public static void main(String[] args) {
        System.out.println("How Many Grades Would you like to Enter?");
        numberOfGrades = scanner.nextInt();
        grades = new int[numberOfGrades];
        marks();
//        for (int grade:grades)
//            System.out.println(grade);

        System.out.println("Sum of all the grades: "+sum());

        System.out.println("Average of all the grades: "+Average());

        // lowest and highest marks

        // this can be done in 2 ways

        //1. by sorting the array and taking the first and last value as lowest and highest
        int[] sorted = Arrays.stream(grades).sorted().toArray();
        System.out.println("lowest grade: "+sorted[0]);

        //2. by writing method to run a loop and get the highest value from the array
        //System.out.println("Highest grade: "+sorted[grades.length-1]);
        System.out.println("Highest grade: "+Highest());
    }


    public static void marks(){
        for(int i =0; i<grades.length;i++){
            System.out.println("Enter Grade for Subject: "+(i+1));
            grades[i] = scanner.nextInt();
        }
    }

    public static int sum(){
        int sum = 0;
        for (int i=0; i<grades.length;i++){
            sum = sum + grades[i];
        }
        return sum;
    }

    public static int Average() {
        int avg = sum() / numberOfGrades;
        return avg;
    }

    public static int Highest(){
        int highest = 0;
        for (int i =0; i<grades.length;i++){
            if (grades[i]>highest){
                highest = grades[i];
            }
        }
        return highest;

    }


}




