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

        System.out.print("\nSum of all the elements of an array: ");
        for (int j = 0; j < arr.length; j++) {
            sum = sum + arr[j];
            if (j < arr.length - 1) {
                System.out.print(arr[j] + " + ");}
            else {
                System.out.print(arr[j] + " = " + sum);
            }
        }
    }
}
