package git.homework.hw5;

import java.util.Scanner;

public class task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer from 1 to 10");
        int integer = scanner.nextInt();

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int number : numbers) {
            int result = number * integer;
            System.out.println(number + " * " + integer + " = " + result);
        }
    }
}
