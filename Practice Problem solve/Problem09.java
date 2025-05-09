import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of lines
        int numLines = scanner.nextInt();

        // Store lines as lists of integers
        List<List<Integer>> lines = new ArrayList<>();
        for (int i = 0; i < numLines; i++) {
            int numElements = scanner.nextInt();
            List<Integer> line = new ArrayList<>();
            for (int j = 0; j < numElements; j++) {
                line.add(scanner.nextInt());
            }
            lines.add(line);
        }

        // Read the number of queries
        int numQueries = scanner.nextInt();

        // Process each query
        for (int i = 0; i < numQueries; i++) {
            int lineIndex = scanner.nextInt() - 1; // Adjust for 0-based indexing
            int elementIndex = scanner.nextInt() - 1;

            // Check if line and element index are valid
            if (lineIndex >= 0 && lineIndex < lines.size() &&
                elementIndex >= 0 && elementIndex < lines.get(lineIndex).size()) {
                // Print the element
                System.out.println(lines.get(lineIndex).get(elementIndex));
            } else {
                // Print error message
                System.out.println("ERROR!");
            }
        }
    }
}
