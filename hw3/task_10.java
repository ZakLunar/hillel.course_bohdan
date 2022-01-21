package git.homework.hw3;

import java.util.Scanner;

public class task_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter boolean value: true, false");
        String booleanValue = scanner.nextLine();

        switch (booleanValue){
            case "true" -> System.out.println("Yes");
            case "false" -> System.out.println("No");
            default -> System.out.println("Entered incorrect value or incorrect register");
        }
    }
}
