package JavaForTesters;

import java.util.Scanner;

public class Methods1 {
    static Scanner scanner = new Scanner(System.in);
    static double requiredSalary = 25000;
    static double requiredCreditScore = 700;

    public static void main(String[] args) {
        double sal = getSalary();
        double Credit = getCreditScore();
        boolean Qualified = isUserQualified(sal, Credit);
        notifyUser(Qualified);


    }

    public static double getSalary() {
        System.out.println("What is your Salary?");
        double Salary = scanner.nextDouble();
        return Salary;
    }

    public static double getCreditScore() {
        System.out.println("What is your credit Score?");
        double CreditScore = scanner.nextDouble();
        return CreditScore;
    }


    public static boolean isUserQualified(double sal, double Credit) {
        if (sal >= requiredSalary && Credit >= requiredCreditScore) {
            return true;
        } else {
            return false;
        }
    }

    public static void notifyUser(boolean isQualified) {
        if (isQualified) {
            System.out.println("user is Qualified");
        } else {
            System.out.println("user is not Qualified");
        }
    }



}


