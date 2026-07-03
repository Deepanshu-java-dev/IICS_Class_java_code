import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class 	 {
    public static void main(String[] args) {
        char[] data = {'J', 'a', 'v', 'a', ' ', 'I', '/', 'O'};

        // Use try-with-resources for automatic resource management
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("buffered_output.txt"))) {
            bufferedWriter.write(data); // Writes the array efficiently
            System.out.println("Data successfully written to buffered_output.txt with BufferedWriter");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}