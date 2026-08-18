import java.util.Scanner;

public class StringAnalyzer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        sentence = sentence.trim();

        String[] words = sentence.split(" ");

        System.out.println("Word Count : " + words.length);

        int firstSpace = sentence.indexOf(" ");
        int lastSpace = sentence.lastIndexOf(" ");

        String firstWord = sentence.substring(0, firstSpace);
        String lastWord = sentence.substring(lastSpace + 1);

        System.out.println("First Word : " + firstWord);
        System.out.println("Last Word : " + lastWord);

        char target = 'J';

        int firstIndex = sentence.indexOf(target);
        int lastIndex = sentence.lastIndexOf(target);

        System.out.println("First 'J' index : " + firstIndex);
        System.out.println("Last 'J' index : " + lastIndex);

        int comparison = firstWord.compareTo(lastWord);

        System.out.println("Comparison (first vs last word) : " + comparison);

        char[] characters = sentence.toCharArray();

        char firstCharacter = characters[0];

        char firstCharacterUsingCharAt = sentence.charAt(0);

        String firstCharacterString =
                String.valueOf(firstCharacterUsingCharAt);

        System.out.println("First character : " + firstCharacterString);

        System.out.println(
                "First character ASCII value : " + (int) firstCharacter
        );

        sc.close();
    }
}