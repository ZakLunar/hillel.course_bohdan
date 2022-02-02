package git.homework.hw5;

import java.util.Locale;
import java.util.Scanner;

public class task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter nucleic acids of DNA. 'HINT: GCAT'");
        String dna = scanner.nextLine();
        dna = dna.toUpperCase();

        if (dna.contains("T")) {
            String rna;
            rna = dna.replace("T", "U");
            System.out.println("Nucleic acids of RNA - " + rna);
        } else {
            System.out.println("You entered incorrect nucleic acids of DNA");
        }
    }
}
