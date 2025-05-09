import java.util.*;

public class Problem13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the array of integers
        System.out.print("Enter the array of integers (separated by spaces): ");
        String[] numsStr = scanner.nextLine().split("\\s+");
        int[] nums = Arrays.stream(numsStr).mapToInt(Integer::parseInt).toArray();

        // Prompt the user to enter the target sum
        System.out.print("Enter the target sum: ");
        int target = scanner.nextInt();

        // Find the indices of the two numbers that add up to the target
        int[] result = twoSum(nums, target);

        // Display the result
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store elements along with their indices
        Map<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                // If found, return the indices of the two numbers
                return new int[]{map.get(complement), i};
            }
            // Otherwise, add the current element and its index to the map
            map.put(nums[i], i);
        }

        // If no solution is found, return an empty array
        return new int[0];
    }
}
