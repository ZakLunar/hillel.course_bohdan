package git.homework.hw2;

import java.util.Scanner;

public class task_5 {
    public static void main(String[] args) {
        String name = "Bohdan";             //
        String pass = "password";           //  Storage
        int validationPass = pass.length(); //

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== LOGIN IN ===\nEnter your 'Name'");
        String logName = scanner.nextLine();
        System.out.println("Enter your 'Password'");
        String logPass = scanner.nextLine();

        if (logName.equals(name) && validationPass == logPass.length()){
            System.out.println("Hello, Bohdan");
        } else if (logName.equals(name) ^ validationPass != logPass.length()) {
            System.out.println("error: Your credential is incorrect");
        } else if (validationPass != logPass.length()){
            System.out.println("error: Your input Password is incorrect");
        } else {
            System.out.println("error: Your Name is incorrect");
        }
    }
}

