import java.io.*;
import java.util.Arrays;

public class SumIntegers {

    public static void main(String[] args) {
        String inputFilePath = "input.txt";
        String outputFilePath = "output.txt";

        try {
            // Read integers from the file and calculate the sum
            int sum = readIntegersAndSum(inputFilePath);

            // Write the sum to output file
            writeSumToFile(outputFilePath, sum);
            System.out.println("Sum has been written to output.txt");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }

    private static int readIntegersAndSum(String filePath) throws IOException {
        int sum = 0;
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split("\\s+");
            for (String part : parts) {
                if (part.matches("\\d+")) { // Check if the string can be parsed to an integer
                    sum += Integer.parseInt(part);
                }
            }
        }
        reader.close();
        return sum;
    }

    private static void writeSumToFile(String filePath, int sum) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
        writer.write(String.valueOf(sum));
        writer.close();
    }
}
