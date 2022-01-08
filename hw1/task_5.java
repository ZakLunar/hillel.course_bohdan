package git.homework.hw1;
//import java.util.*;
import java.util.Scanner;

public class task_5 {
    public static void main(String[]args){
        /**
         * program generate random int in a specific range from 0 - 30 to 70 - 100
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter a min value of range 0 - 30 and press Enter");
        int min = scanner.nextInt();
        System.out.println("Please, enter a max value of range 70 - 100 and press Enter");
        int max = scanner.nextInt();

        double a = Math.random() * 100;
        int random = (int)a;
        if (random < min){
            random += min;
            System.out.println(random);
        } else if(random > max){
            random -= (100 - max);
            System.out.println(random);
        } else {
            System.out.println("Your random number is " + random);
        }

        //Date current_Date = new Date();
        //System.out.println(current_Date);

        System.out.println("User: Zaklunnyi, added: 30.12.2021 11:49, resolved: 4.01.2022 21:17"); //info
    }
}