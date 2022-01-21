package git.homework.hw3;

import java.util.Scanner;

public class task_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter travel time");
        double time = scanner.nextDouble();
        int litres = (int) time / 2;

        System.out.println("Time = " + time + " ----> litres = " + litres);
    }
}
