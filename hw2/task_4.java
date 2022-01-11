package git.homework.hw2;

import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string of 3 characters");
        String string = scanner.nextLine();

        int characters = string.length();
        if (characters < 3){
            System.out.println("error: String is too short");
        } else if (characters > 3){
            System.out.println("error: String is too long");
        } else {
            System.out.println("Congratulations!! Your string is correct");
        }
    }
}
