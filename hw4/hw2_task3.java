package git.homework.hw4;

import java.util.Scanner;

public class hw2_task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your number of day 1..7");
        int day = scanner.nextInt();

        dayOfWeek(day);
    }

    static void dayOfWeek (int day){
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("The number of day is invalid");
        }
    }
}
