package hillel.course_bohdan.homework.hw1;

import java.util.Scanner;

import static java.lang.Math.*;

public class task_3 {
    /**
     * BMI = pounds * 703/in2
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter your weight in pounds and press Enter");
        int pounds = scanner.nextInt();
        System.out.println("Please, enter your height in inches and press Enter");
        int inches = scanner.nextInt();

        //double pounds = 452;// pounds
        //double inches = 72;// inches
        double bmi = pounds * 703 / pow(inches, 2); //bmi formula
        System.out.println("Body Mass Index is " + bmi);

        System.out.println("User: Zaklunnyi, added: 30.12.2021 11:49, resolved: 4.01.2022 21:17"); //info
    }
}
