package git.homework.hw4;

import java.util.Scanner;

public class hw1_task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the number of minutes and press Enter");
        int m = scanner.nextInt();

        convertMinutesToYear(m);

    }
    static void convertMinutesToYear (int minutes){
        int h = minutes / 60; //hours
        int d = h / 24; //days
        int mth = d / 30; //mouth
        int y = mth / 12; //years
        int days = d % 365; // days remaining after displaying years
        System.out.println(minutes + " minutes is approximately " + y + " years and " + days + " days");
    }
}
