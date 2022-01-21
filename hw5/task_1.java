package git.homework.hw5;

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String newString = scanner.nextLine();

        noSpace(newString);
    }

    static void noSpace (String x){
        String noSpace = x.replaceAll("\\s", "");
        System.out.println(noSpace);

    }
}
