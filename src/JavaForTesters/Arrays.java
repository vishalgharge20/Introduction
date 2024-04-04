package JavaForTesters;

import java.util.Random;

//public class Arrays {
//
//    private static final int LENGTH = 6;
//    public static int maxTicketNumber = 99;
//
//    public static void main(String[] args) {
//        int[] ticket = generateNumbers();
//        printTicket(ticket);
//    }
//
//    public static int[] generateNumbers() {
//        int[] lotteryNumber = new int[LENGTH];
//        Random random = new Random();
//        for (int i = 0; i < LENGTH; i++) {
//            lotteryNumber[i] = random.nextInt(maxTicketNumber) + 1;
//            //System.out.print(lotteryNumber[i]+" | ");
//        }
//        return lotteryNumber;
//
//    }
//
//    public static void printTicket(int[] lotteryNumber) {
//        for (int i = 0; i < LENGTH; i++) {
//            System.out.print(lotteryNumber[i] + " | ");
//        }
//    }
//
//
//}



/*
This can be done in a combined way also
 */


public class Arrays {

    private static final int LENGTH = 6;
    public static int maxTicketNumber = 99;

    public static void main(String[] args) {
        int[] ticket = generateNumbers();
    }

    public static int[] generateNumbers() {
        int[] lotteryNumber = new int[LENGTH];
        Random random = new Random();
        for (int i = 0; i < LENGTH; i++) {
            lotteryNumber[i] = random.nextInt(maxTicketNumber) + 1;
            System.out.print(lotteryNumber[i]+" | ");
        }
        return lotteryNumber;

    }
}