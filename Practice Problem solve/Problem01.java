import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int positiveCount = 0;
        int negativeCount = 0;
        int sum = 0;
        int count = 0;
        
        System.out.println("Enter ten integers (enter 0 to stop):");
        
        while (count < 10) {
            int num = input.nextInt();
            
            if (num == 0) {
                break;
            }
            if (num > 0) {
                positiveCount++;
                sum = sum + num;
            } else if (num < 0) {
                negativeCount++;
                sum = sum + num;
            }
            count++;
        }
        if (count == 0) {
            System.out.println("No numbers entered!");
        } else {
            double avg = (double) sum / count;

        System.out.println("Number of negative numbers: " + negativeCount);
        System.out.println("Number of positive numbers: " + positiveCount);  
        System.out.println("Total sum: " + sum);    
        System.out.println("Average: " + avg);
        }      
    }
}

