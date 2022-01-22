package git.homework.hw4;

import java.util.Scanner;

public class hw1_task1 {
    public static void main(String[] args) {
        // 1 inch = 0.0254 meter
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter a value and press Enter");
        double i = scanner.nextDouble();

        double m = convertIncesToMeters(i);

        System.out.println(i + " inch is " + m + " meters");
    }
    static double convertIncesToMeters (double i){
        return i * 0.0254;
    }
}
