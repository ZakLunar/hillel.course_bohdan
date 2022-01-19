package git.homework.hw3;

import java.util.Scanner;

public class task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter number of petals of the first flower");
        int firstFlower = scanner.nextInt();
        System.out.println("Please, enter number of petals of the second flower");
        int secondFlower = scanner.nextInt();

        System.out.print("In love: ");
        if (1 == firstFlower%2 ^ 1 == secondFlower%2){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
