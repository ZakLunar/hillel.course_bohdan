package git.homework.hw4;

import java.util.Scanner;

public class hw1_task5 {
    public static void main(String[]args){
        /**
         * program generate random int in a specific range from 0 - 30 to 70 - 100
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter a min value of range 0 - 30 and press Enter");
        int min = scanner.nextInt();
        System.out.println("Please, enter a max value of range 70 - 100 and press Enter");
        int max = scanner.nextInt();

        randomIntFromTo(min, max);

    }
    static void randomIntFromTo (int min, int max){
        int random = (int) (Math.random() * 100);

        if (random < min){
            random += min;
            System.out.println(random);
        } else if(random > max){
            random -= (100 - max);
            System.out.println(random);
        } else {
            System.out.println("Your random number is " + random);
        }
    }
}
