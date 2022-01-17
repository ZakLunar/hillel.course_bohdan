package git.homework.hw3;

import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr;
        arr = new int[5];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            int number = i + 1;
            System.out.println("Please enter " + number + " number");
            int nuumberOfArray = scanner.nextInt();
            arr[i] = nuumberOfArray;
        }

        System.out.print("Original array: ");
        for (int j : arr) {
            System.out.print(j + ", ");
        }

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        System.out.println("\nSum of all the elements of an array:" + sum);
    }
}
