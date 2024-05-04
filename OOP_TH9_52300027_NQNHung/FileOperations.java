import java.io.*;
import java.nio.file.*;
import java.util.*;

public class FileOperations {

    // Get specific files by extensions from a given folder
    public static List<File> getFilesByExtension(File folder, String extension) {
        File[] files = folder.listFiles((dir, name) -> name.endsWith(extension));
        return files != null ? Arrays.asList(files) : Collections.emptyList();
    }

    // Check if a file or directory exists
    public static boolean checkExists(String path) {
        return Files.exists(Paths.get(path));
    }

    // Check if the pathname is a directory or a file
    public static String checkType(String path) {
        File file = new File(path);
        if (!file.exists()) {
            return "Path does not exist";
        } else if (file.isDirectory()) {
            return "It is a directory";
        } else {
            return "It is a file";
        }
    }

    // Append text to an existing file
    public static void appendToFile(String path, String text) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
        writer.append(text);
        writer.newLine();
        writer.close();
    }

    // Find the longest word in a text file
    public static String findLongestWord(String path) throws IOException {
        String longestWord = "";
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line;
        while ((line = reader.readLine()) != null) {
            for (String word : line.split("\\s+")) {
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
        }
        reader.close();
        return longestWord;
    }

    public static void main(String[] args) {
        File folder = new File("./");
        List<File> txtFiles = getFilesByExtension(folder, ".txt");
        System.out.println("Text files in folder: " + txtFiles);

        String path = "./input.txt";
        System.out.println("Exists: " + checkExists(path));
        System.out.println("Type: " + checkType(path));

        try {
            appendToFile(path, "Added new line of text");
            System.out.println("Text appended to file successfully.");
        } catch (IOException e) {
            System.out.println("Error appending text: " + e.getMessage());
        }

        try {
            String longestWord = findLongestWord(path);
            System.out.println("Longest word in the file: " + longestWord);
        } catch (IOException e) {
            System.out.println("Error finding longest word: " + e.getMessage());
        }
    }
}
