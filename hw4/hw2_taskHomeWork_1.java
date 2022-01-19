package git.homework.hw4;

import java.util.Calendar;
import java.util.Scanner;

public class hw2_taskHomeWork_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter the year");
        int year = scanner.nextInt();
        System.out.println("Please, enter the number of month");
        int month = scanner.nextInt() - 1;

        countDayInMonth(month, year);
    }

    static void countDayInMonth (int month, int year){
        Calendar calendar = Calendar.getInstance();
        if (month >= 12 || month < 0){
            System.out.println("This is invalid month");
        } else {
            calendar.set(year, month, 1);

            int days = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
            System.out.println("The number of days in this month - " + days);
        }
    }
}
