package Lab7.FileOperations;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String inputFileLongestWord = "src/Lab7/FileOperations/testFile.txt";
        String inputFile = "src/Lab7/Calculator/input.txt";
        String currentClassFile = "src/Lab7/FileOperations/FileOperations.java";

        FileOperations fileOperations = new FileOperations();

        try {
            // a. Cel mai lung cuvant
            String longestWord = fileOperations.findLongestWord(inputFile);
            System.out.println("Cel mai lung cuvant este: " + longestWord);

            // b. Adauga continutul clasei curente in fisier
            fileOperations.appendCurrentClassToFile(currentClassFile, inputFile);
            System.out.println("Clasa a fost adaugata in fisier.");

            // c. Salvare continut linie cu linie in array
            String[] lines = fileOperations.readFileLinesToArray(inputFile);
            System.out.println("Continutul fisierului linie cu linie:");
            for (String line : lines) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.err.println("Eroare: " + e.getMessage());
        }
    }
}
