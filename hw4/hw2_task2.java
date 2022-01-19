package git.homework.hw4;

import java.util.Scanner;

public class hw2_task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your current time");
        int time = scanner.nextInt();

        partOfTheDay4(time);
    }

    static void partOfTheDay4 (int time){
        if (time > 24) {
            System.out.println("Your time is invalid");
        } else if (time > 18 || time < 6) {
            System.out.println("Your time is Good Evening");
        } else if (time >= 10) {
            System.out.println("Your time is Good Day");
        } else {
            System.out.println("Your time is Good morning");
        }
    }
}
