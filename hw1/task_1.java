package git.homework.hw1;

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        /** 1 inch = 0.0254 meter */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter a value and press Enter");
        double i = scanner.nextDouble();

        //double i = 1000; //inch
        double m = i * 0.0254; //meters
        System.out.println( i + " inch is " + m + " meters");

        System.out.println("User: Zaklunnyi, added: 30.12.2021 11:49, resolved: 4.01.2022 21:17"); //info

    }
}
