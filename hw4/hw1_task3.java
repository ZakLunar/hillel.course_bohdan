package git.homework.hw4;

import java.util.Scanner;

import static java.lang.Math.pow;

public class hw1_task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter your weight in pounds and press Enter");
        int pounds = scanner.nextInt();
        System.out.println("Please, enter your height in inches and press Enter");
        int inches = scanner.nextInt();

        double bmi = countBMI(pounds, inches);
        System.out.println("Body Mass Index is " + bmi);

    }
    static double countBMI (int pounds, int inches){
        return pounds * 703 / pow(inches, 2); //bmi formula
    }
}
