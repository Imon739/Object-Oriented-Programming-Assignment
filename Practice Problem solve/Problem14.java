import java.util.Arrays;
import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the array of integers
        System.out.print("Enter the array of integers (separated by spaces): ");
        String[] numsStr = scanner.nextLine().split("\\s+");
        int[] nums = Arrays.stream(numsStr).mapToInt(Integer::parseInt).toArray();

        // Move zeroes to the end of the array
        moveZeroes(nums);

        // Display the modified array
        System.out.println("Output: " + Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {
        int left = 0; // Pointer to track the position to place non-zero elements
        int right = 0; // Pointer to iterate through the array

        // Move non-zero elements to the beginning of the array
        while (right < nums.length) {
            // If the current element is non-zero, move it to the left pointer position
            if (nums[right] != 0) {
                nums[left] = nums[right];
                left++;
            }
            right++;
        }

        // Fill the remaining positions with zeros
        while (left < nums.length) {
            nums[left] = 0;
            left++;
        }
    }
}
