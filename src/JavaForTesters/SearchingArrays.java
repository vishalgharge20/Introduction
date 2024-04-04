package JavaForTesters;

import java.util.Arrays;
import java.util.Random;

public class SearchingArrays {

        private static final int LENGTH = 6;
    public static int maxTicketNumber = 99;

    public static void main(String[] args) {
        int[] ticket = generateNumbers();
        printTicket(ticket);
    }

    public static int[] generateNumbers() {
        int[] lotteryNumber = new int[LENGTH];
        Random random = new Random();
        for (int i = 0; i < LENGTH; i++) {
            int radomNum;

            /**
             * do-while loop is used to generate random numbers until a unique one is found
             * if condition is true, it keeps generating new numbers untill condition is false and that number does not
             * exist in the array
             */
            do {
                radomNum = random.nextInt(maxTicketNumber) + 1;
            }
            while (binarySearch(lotteryNumber,radomNum));

            lotteryNumber[i] = radomNum;
        }
        return lotteryNumber;
    }

    public static void printTicket(int[] lotteryNumber) {
        for (int i = 0; i < LENGTH; i++) {
            System.out.print(lotteryNumber[i] + " | ");
        }
    }

    /**
     *
     * @param array array list that you want to search for
     * @param numToSearch num that you want to search for in array
     * @return true if found and false if not
     */
    public static boolean search(int[] array,int numToSearch){
        // new for loop statement
        for (int index : array){
            if (index == numToSearch){
                return true;
            }
        }
        return false;
    }

    // Binary search
    // first array must be sorted
    public static boolean binarySearch(int[] array,int numToSearch){
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, numToSearch);
        if (index>=0){
            return true;
        }
        else return false;
    }

}
