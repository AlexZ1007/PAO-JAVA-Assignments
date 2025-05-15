package Lab7.FileOperations;

import java.io.*;

public class FileOperations {

    public  String findLongestWord(String filePath) throws IOException {
        String longest = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                for (String word : line.split("\\s+")) {
                    if (word.length() > longest.length()) {
                        longest = word;
                    }
                }
            }
        }
        return longest;
    }

    public  void appendCurrentClassToFile(String currentClassPath, String targetFilePath) throws IOException {
        try (
                BufferedReader reader = new BufferedReader(new FileReader(currentClassPath));
                BufferedWriter writer = new BufferedWriter(new FileWriter(targetFilePath, true))
        ) {
            writer.write("\n\n// --- INCEPUT INSERARE ---\n");
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            writer.write("// --- SFARSIT INSERARE ---\n");
        }
    }

    public  String[] readFileLinesToArray(String filePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            return reader.lines().toArray(String[]::new);
        }
    }
}


