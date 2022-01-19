package git.homework.hw3;

import java.util.Scanner;

public class task_5    {
    public static void main(String[] args) {

        // ====== Case with if:else ======
//        String[] arr = {"red", "yellow", "green"};
//
//        if (currentState.equals(arr[0])) {
//            System.out.println("The next traffic light color is yellow");
//        } else if (currentState.equals(arr[1])){
//            System.out.println("The next traffic light color is green");
//        } else if (currentState.equals(arr[2])){
//            System.out.println("The next traffic light color is red");
//        } else {
//            System.out.println("You entered the traffic light state incorrectly");
//        }
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the current traffic lights color: red, yellow, green");
        String currentState = scanner.nextLine();

        switch (currentState) {
            case "red" -> System.out.println("The next traffic light color is yellow");
            case "yellow" -> System.out.println("The next traffic light color is green");
            case "green" -> System.out.println("The next traffic light color is red");
            default -> System.out.println("You entered the traffic light state incorrectly");
        }
    }
}
