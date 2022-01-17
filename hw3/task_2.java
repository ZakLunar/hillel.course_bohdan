package git.homework.hw3;

import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr;
        arr = new int[9]; //amount numbers of array

        //adding numbers to array
        for (int i = 0; i < arr.length; i++) {
            int number = i + 1;
            System.out.println("Please enter " + number + " number");
            int nuumberOfArray = scanner.nextInt();
            arr[i] = nuumberOfArray;
        }

        //searching duplicate numbers
        System.out.print("Duplicate elements in given array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[j] + ", ");
                }
            }
        }
            System.out.println("\n");

        //printing numbers from array
        for (int j : arr) {
            System.out.print(j + ", ");
        }

    }
}
