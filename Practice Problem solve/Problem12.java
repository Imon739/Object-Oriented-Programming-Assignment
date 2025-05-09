import java.util.HashSet;
import java.util.Set;

public class Problem12 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 2, 3, 4};

        System.out.println("Example 1: " + containsDuplicate(nums1)); // true
        System.out.println("Example 2: " + containsDuplicate(nums2)); // false
    }

    public static boolean containsDuplicate(int[] nums) {

        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {

            if (seen.contains(num)) {
                return true;
            }

            seen.add(num);
        }
        return false;
    }
}
