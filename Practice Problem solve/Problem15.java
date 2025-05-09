import java.util.Arrays;
import java.util.Scanner;

public class Problem15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the array of integers
        System.out.print("Enter the array of integers (separated by spaces): ");
        String[] numsStr = scanner.nextLine().split("\\s+");
        int[] nums = Arrays.stream(numsStr).mapToInt(Integer::parseInt).toArray();

        // Prompt the user to enter the number of steps to rotate
        System.out.print("Enter the number of steps to rotate: ");
        int k = scanner.nextInt();

        // Rotate the array
        rotate(nums, k);

        // Display the rotated array
        System.out.println("Output: " + Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k) {
        k %= nums.length; // In case k is greater than the length of the array

        // Reverse the entire array
        reverse(nums, 0, nums.length - 1);
        // Reverse the first k elements
        reverse(nums, 0, k - 1);
        // Reverse the remaining elements
        reverse(nums, k, nums.length - 1);
    }

    // Helper function to reverse the elements of the array between start and end indices
    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
