import javax.swing.JOptionPane;

public class Problem02 {
    public static void main(String[] args) {
        // Prompt the user to enter the first positive integer
        String input1 = JOptionPane.showInputDialog("Enter the first positive integer:");
        int n1 = Integer.parseInt(input1);

        // Prompt the user to enter the second positive integer
        String input2 = JOptionPane.showInputDialog("Enter the second positive integer:");
        int n2 = Integer.parseInt(input2);

        // Find the minimum of n1 and n2
        int d = Math.min(n1, n2);

        // Initialize GCD variable
        int gcd = 1;

        // Find the greatest common divisor
        for (int i = d; i >= 1; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
                break;
            }
        }

        // Display the result
        JOptionPane.showMessageDialog(null, "The GCD of " + n1 + " and " + n2 + " is: " + gcd);
    }
}
