import java.io.*;

public class ConvertToUpper {
    public static void main(String[] args) {
        String inputPath = "input.txt";
        String outputPath = "output.txt";
        
        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
             
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toUpperCase() + "\n");
            }
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
