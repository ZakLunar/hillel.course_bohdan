package git.homework.hw4;

import java.util.Scanner;

public class hw2_task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== LOGIN IN ===\nEnter your 'Name'");
        String logName = scanner.nextLine();
        System.out.println("Enter your 'Password'");
        String logPass = scanner.nextLine();

        autentificationUser(logName, logPass);
    }

    static void autentificationUser (String logName, String logPass){
        String name = "Bohdan";             //
        String pass = "password";           //  Storage
        int validationPass = pass.length(); //

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
