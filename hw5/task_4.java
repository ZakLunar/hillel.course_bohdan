package git.homework.hw5;

import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String newString = scanner.nextLine();

        String cut = cutFirstAndLastCharacter(newString);
        System.out.println(cut);
    }

    static String cutFirstAndLastCharacter(String newString) {
        int lastChar = newString.length() - 1;
        return newString.substring(1, lastChar);
    }
}
