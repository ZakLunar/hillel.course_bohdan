package git.homework.hw3;

import java.util.Scanner;

public class task_3 {
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

        System.out.print("Original array: ");
        for (int j : arr) {
            System.out.print(j + ", ");
        }

        System.out.print("\nArray in reverse order: ");
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + ", ");
        }
       }
}
