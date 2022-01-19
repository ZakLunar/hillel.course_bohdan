package git.homework.hw3;

import java.util.Scanner;

public class task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter number of month");
        int month = scanner.nextInt();

        if (month <= 0 || month > 12){
            System.out.println("You entered an invalid month number");
        }else if (month <= 3){
            System.out.println("This month is Q1");
        } else  if (month <= 6) {
            System.out.println("This month is Q2");
        } else  if (month <= 9) {
            System.out.println("This month is Q3");
        } else {
            System.out.println("This month is Q4");
        }
    }
}
