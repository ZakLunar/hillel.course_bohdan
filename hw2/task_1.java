package git.homework.hw2;

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter the time in hours");
        int hour = scanner.nextInt();

        if (hour > 24){
            System.out.println("Your value is invalid");
        } else if (hour >= 18 || hour < 7){
            System.out.println("It's Good evening");
        } else {
            System.out.println("It's Good day");
        }
    }
}
