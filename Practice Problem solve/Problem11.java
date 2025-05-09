import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        String[] words = sentence.split("\\s+");

        String largestWord = "";
        int maxLength = 0;

        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z]", "");

            if (word.length() > maxLength) {
                maxLength = word.length();
                largestWord = word;
            }
        }
        System.out.println("The largest word in the sentence is: " + largestWord);
    }
}
