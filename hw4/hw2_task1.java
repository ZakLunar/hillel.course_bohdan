package git.homework.hw4;

import java.util.Scanner;

public class hw2_task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter the time in hours");
        int hour = scanner.nextInt();

        partOfTheDay(hour);
    }

    static void partOfTheDay (int hour){
        if (hour > 24){
            System.out.println("Your value is invalid");
        } else if (hour >= 18 || hour < 7){
            System.out.println("It's Good evening");
        } else {
            System.out.println("It's Good day");
        }
    }
}
