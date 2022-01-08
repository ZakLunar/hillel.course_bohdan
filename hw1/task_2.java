package git.homework.hw1;

import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the number of minutes and press Enter");
        int m = scanner.nextInt();

        //int m = 3456789; //minutes
        int h = m / 60; //hours
        int d = h / 24; //days
        int mth = d / 30; //mouth
        int y = mth / 12; //years
        int days = d % 365; // days remaining after displaying years
        System.out.println(m + " minutes is approximately " + y + " years and " + days + " days");

        System.out.println("User: Zaklunnyi, added: 30.12.2021 11:49, resolved: 4.01.2022 21:17"); //info
    }
}
