package git.homework.hw5;

import java.util.Locale;
import java.util.Scanner;

public class task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your First name and Last name");
        String username = scanner.nextLine();
        username = username.toUpperCase();

        String[] arrString = username.split("\\s");

        for (int i = 0; i < arrString.length; i++) {
            arrString[i] = String.valueOf(arrString[i].charAt(0));
        }
        String initials = String.join(".", arrString);

        System.out.println(initials);
    }
}
