import java.util.ArrayList;

public class Problem10 {
    public static void main(String[] args) {
        System.out.println(fibonacciSequence(5)); // Output: [0, 1, 1, 2, 3]
        System.out.println(fibonacciSequence(8)); // Output: [0, 1, 1, 2, 3, 5, 8, 13]
    }

    public static ArrayList<Integer> fibonacciSequence(int n) {
        ArrayList<Integer> sequence = new ArrayList<>();

        if (n >= 1) {
            sequence.add(0); 
        if (n >= 2) {
            sequence.add(1); 
        }
        for (int i = 2; i < n; i++) {
            int term = sequence.get(i - 1) + sequence.get(i - 2);
            sequence.add(term);
        }
    }
        return sequence;
    }
}