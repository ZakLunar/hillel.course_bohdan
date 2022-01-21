package git.homework.hw5;

import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String se = "Hello world. My name is Bohdan";
        //"I love arrays they are my favorite" ==> ["I", "love", "arrays", "they", "are", "my", "favorite"]

        String qw = scanner.nextLine();
        arrayWithMyString(qw);
    }

    static void arrayWithMyString(String qw) {
        String[] array = qw.split("\\s");
        for (String j : array) {
            System.out.println(j);
        }
    }
}