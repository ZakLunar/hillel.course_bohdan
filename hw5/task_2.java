package git.homework.hw5;

import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        printGreeting(name);
    }
    static void printGreeting (String name){
        System.out.println("Hello, " + name + " how are you doing today?");
    }
}
