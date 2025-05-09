import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int numStudents = input.nextInt();

        int[] scores = new int[numStudents];
        System.out.print("Enter " + numStudents + " scores: ");
        for (int i = 0; i < numStudents; i++) {
            scores[i] = input.nextInt();
        }

        int bestScore = findBestScore(scores);

        for (int i = 0; i < numStudents; i++) {
            char grade = assignGrade(scores[i], bestScore);
            System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grade);
        }
    }

    // Method to find the best score
    public static int findBestScore(int[] scores) {
        int bestScore = scores[0];
        for (int score : scores) {
            if (score > bestScore) {
                bestScore = score;
            }
        }
        return bestScore;
    }

    // Method to assign grades based on the given scheme
    public static char assignGrade(int score, int bestScore) {
        if (score >= bestScore - 10) {
            return 'A';
        } else if (score >= bestScore - 20) {
            return 'B';
        } else if (score >= bestScore - 30) {
            return 'C';
        } else if (score >= bestScore - 40) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
