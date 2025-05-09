import java.util.*;

public class Problem16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the array of integers
        System.out.print("Enter the array of integers (separated by spaces): ");
        String[] numsStr = scanner.nextLine().split("\\s+");
        int[] nums = Arrays.stream(numsStr).mapToInt(Integer::parseInt).toArray();

        // Remove duplicates from the array
        removeDuplicates(nums);

        // Display the array after removing duplicates
        System.out.println("Output: " + Arrays.toString(nums));
    }

    public static void removeDuplicates(int[] nums) {
        // Create a HashSet to store unique elements
        Set<Integer> set = new HashSet<>();
        // Create a pointer to track the position to place non-duplicate elements
        int index = 0;

        // Iterate through the array
        for (int num : nums) {
            // If the element is not already in the set, add it to the set and copy it to the array
            if (!set.contains(num)) {
                set.add(num);
                nums[index++] = num;
            }
        }

        // Resize the array to remove duplicates
        nums = Arrays.copyOf(nums, index);
    }
}
