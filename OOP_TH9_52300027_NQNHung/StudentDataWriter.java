import java.io.*;
import java.util.ArrayList;

public class StudentDataWriter {

    public static <E> boolean writeFile(String path, ArrayList<E> list) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            for (E element : list) {
                writer.write(element.toString() + "\n");
            }
            return true;
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
            return false;
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", "S001", 3.5));
        students.add(new Student("Bob", "S002", 3.8));

        boolean result = writeFile("students.txt", students);
        if (result) {
            System.out.println("File was written successfully.");
        } else {
            System.out.println("Failed to write the file.");
        }
    }
}
