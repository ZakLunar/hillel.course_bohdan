package git.homework.hw3;

import java.util.Scanner;
import static java.lang.Math.pow;

public class task_6 {
    /**
     * BMI = pounds * 703/in2
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter your weight in kg and press Enter");
        float kg = scanner.nextFloat();
        System.out.println("Please, enter your height in cm and press Enter");
        float cm = scanner.nextFloat();

        //double pounds = 452;// pounds
        //double inches = 72;// inches
        float bmi = (float) (kg / pow(cm/100, 2)); //bmi formula
        System.out.println("Body Mass Index is " + bmi + "\n");

        if(bmi <= 18.5)
            System.out.println("Result: Underweight");
        else if(bmi <= 25)
            System.out.println("Result: Normal");
        else if(bmi <= 30)
            System.out.println("Result: Overweight");
        else
            System.out.println("Result: Obese");
    }
}
