package git.homework.hw2;

import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your current time");
        int time = scanner.nextInt();

        if (time > 24) {
            System.out.println("Your time is invalid");
        } else if (time > 18 || time < 6) {
            System.out.println("Your time is Good Evening");
        } else if (time >= 10 && time <= 18) {
            System.out.println("Your time is Good Day");
        } else {
            System.out.println("Your time is Good morning");
        }
    }
}
