package JavaForTesters;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {

/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("How Many Items are there?");
        double items= scanner.nextDouble();
        double total = 0 ;

        for(int i = 0; i<items; i++){
            System.out.println("Enter the cost of the item");
            double cost = scanner.nextDouble();
            total = total + cost;
        }
        System.out.println("Final Total is: $"+total);

 */

        Scanner scanner = new Scanner(System.in);
        char letter = 'a';
        System.out.println("Enter the Required Sting");
        String word = scanner.next();
        boolean found = false;

        for (int i = 0; i < word.length(); i++) {
            char CurrentChar = word.charAt(i);
            if (CurrentChar == letter) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Letter found");
        } else {
            System.out.println("Letter not found");
        }





    }
}



