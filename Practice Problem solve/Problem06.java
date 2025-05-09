import java.util.HashSet;
import java.util.Scanner;

public class Problem06 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] distinctNumbers = new int[10]; // Array to store distinct numbers
        int numDistinct = 0; // Count of distinct numbers

        System.out.println("Enter ten numbers:");
        for (int i = 0; i < 10; i++) {
            int number = input.nextInt();

            // Check if number is already present using efficient isDistinct() method
            if (!isDistinct(distinctNumbers, numDistinct, number)) {
                continue; // Ignore duplicate numbers
            }

            // Store the distinct number in the array and increment count
            distinctNumbers[numDistinct++] = number;
        }

        if (numDistinct == 0) {
            System.out.println("No distinct numbers entered.");
        } else {
            System.out.print("Distinct numbers: ");
            for (int i = 0; i < numDistinct; i++) {
                System.out.print(distinctNumbers[i] + " ");
            }
            System.out.println();
        }
    }

    // Optimized isDistinct() method using a HashSet for efficient duplicate checking
    public static boolean isDistinct(int[] arr, int count, int num) {
        // Create a HashSet to store checked numbers for faster lookup
        HashSet<Integer> checked = new HashSet<>();

        for (int i = 0; i < count; i++) {
            if (arr[i] == num) {
                return false; // Number already present, not distinct
            }
            // Efficiently avoid re-checking previously seen numbers
            checked.add(arr[i]);
        }

        // If not found in the array or checked set, it's distinct
        return true;
    }
}
