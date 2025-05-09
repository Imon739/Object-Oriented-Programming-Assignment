import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {

        int[] counts = new int[101]; // Index 0 is not used, so the array size is 101

        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter integers
        System.out.println("Enter integers between 1 and 100 (enter 0 to end):");

        // Read the first integer
        int num = input.nextInt();

        // Keep reading integers until 0 is entered
        while (num != 0) {
            // Increment the count for the entered number if it's between 1 and 100
            if (num >= 1 && num <= 100) {
                counts[num]++;
            } else {
                System.out.println("Please enter an integer between 1 and 100.");
            }

            // Read the next integer
            num = input.nextInt();
        }

        // Display the occurrences of each integer
        for (int i = 1; i <= 100; i++) {
            if (counts[i] > 0) {
                System.out.println(i + " occurs " + counts[i] + " time(s)");
            }
        }
    }
}
