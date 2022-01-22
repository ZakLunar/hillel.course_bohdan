package git.homework.hw4;

import java.util.Scanner;

public class hw2_task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string of 3 characters");
        String string = scanner.nextLine();

        checkStringFor3Characters(string);
    }

    static void checkStringFor3Characters (String string){
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
