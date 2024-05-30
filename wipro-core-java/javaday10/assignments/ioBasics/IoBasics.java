package javaday10.assignments.ioBasics;



    import java.io.*;
import java.util.*;
public class IoBasics {

//public class WordFrequencyCounter {
    public static void main(String[] args) {
        String inputFileName = "input.txt"; // Change this to your input file name
        String outputFileName = "output.txt"; // Change this to your output file name

        // Check if input file exists
        File inputFile = new File(inputFileName);
        if (!inputFile.exists()) {
            System.err.println("Input file not found: " + inputFileName);
            return;
        }

        // HashMap to store word frequencies
        Map<String, Integer> wordFrequencyMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            // Read each line from the input file
            while ((line = reader.readLine()) != null) {
                // Split the line into words using space as delimiter
                String[] words = line.split("\\s+");
                for (String word : words) {
                    // Remove punctuation and convert to lowercase
                    word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
                    // Update word frequency map
                    wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }

        // Write word frequencies to output file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {
            for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue());
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }

        System.out.println("Word frequencies have been written to " + outputFileName);
    }
}
    

    

