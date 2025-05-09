import java.util.ArrayList;
import java.util.Random;

public class Problem08{

   public static void main(String[] args) {
       ArrayList<Integer> numbers = new ArrayList<>(100);
       Random random = new Random();

       // Generate 100 random integers between -100 and 100
       for (int i = 0; i < 100; i++) {
           numbers.add(random.nextInt(201) - 100); // Range: -100 to 100
       }

       int secondHighestValue = findSecondHighest(numbers);
       int secondHighestIndex = indexOf(numbers, secondHighestValue);

       int secondSmallestValue = findSecondSmallest(numbers);
       int secondSmallestIndex = indexOf(numbers, secondSmallestValue);

       System.out.println("Second highest value: " + secondHighestValue + " at index " + secondHighestIndex);
       System.out.println("Second smallest value: " + secondSmallestValue + " at index " + secondSmallestIndex);
   }

   public static int findSecondHighest(ArrayList<Integer> numbers) {
       int highest = findHighest(numbers);
       int secondHighest = Integer.MIN_VALUE;

       for (int num : numbers) {
           if (num > secondHighest && num < highest) {
               secondHighest = num;
           }
       }

       return secondHighest;
   }

   public static int findSecondSmallest(ArrayList<Integer> numbers) {
       int smallest = findSmallest(numbers);
       int secondSmallest = Integer.MAX_VALUE;

       for (int num : numbers) {
           if (num < secondSmallest && num > smallest) {
               secondSmallest = num;
           }
       }

       return secondSmallest;
   }

   public static int findHighest(ArrayList<Integer> numbers) {
       int highest = Integer.MIN_VALUE;

       for (int num : numbers) {
           highest = Math.max(highest, num);
       }

       return highest;
   }

   public static int findSmallest(ArrayList<Integer> numbers) {
       int smallest = Integer.MAX_VALUE;

       for (int num : numbers) {
           smallest = Math.min(smallest, num);
       }

       return smallest;
   }

   public static int indexOf(ArrayList<Integer> numbers, int value) {
       for (int i = 0; i < numbers.size(); i++) {
           if (numbers.get(i) == value) {
               return i;
           }
       }
       return -1; // Not found
   }
}
