package git.homework.hw3;

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr;
        arr = new int[5];


        for (int i = 0; i < arr.length; i++) {
            int number = i + 1;
            System.out.println("Please enter " + number + " number");
            int nuumberOfArray = scanner.nextInt();
            arr[i] = nuumberOfArray;
        }

        for (int j : arr) {
            System.out.print(j + ", ");
        }
    }
}
