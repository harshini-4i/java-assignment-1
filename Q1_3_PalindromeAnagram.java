import java.util.Arrays;
import java.util.Scanner;

public class Q1_3_PalindromeAnagram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        System.out.print("Enter third string: ");
        String str3 = sc.nextLine();

        String cleaned = str1.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String reversed = new StringBuilder(cleaned).reverse().toString();

        boolean palindrome = cleaned.equals(reversed);

        String anagram1 = str2.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String anagram2 = str3.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        char[] arr1 = anagram1.toCharArray();
        char[] arr2 = anagram2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean anagram = Arrays.equals(arr1, arr2);

        boolean valid = cleaned.matches("[a-zA-Z0-9]+");

        boolean containsPlan = cleaned.toLowerCase().contains("plan");

        String palindromeResult = String.format(
                "Palindrome : %s", palindrome);

        String anagramResult = String.format(
                "Anagram : %s", anagram);

        String formattedReport = String.join(
                " | ",
                palindromeResult,
                anagramResult
        );

        String poolString1 = new String("Java").intern();
        String poolString2 = new String("Java").intern();

        boolean hashCodesEqual =
                poolString1.hashCode() == poolString2.hashCode();

        System.out.println();

        System.out.println(
                "Palindrome Check : \"" + str1 + "\" -> " + palindrome);

        System.out.println(
                "Anagram Check : \"" + str2 + "\" & \"" + str3 + "\" -> " + anagram);

        System.out.println(
                "Formatted Report : [ " + formattedReport + " ]");

        System.out.println(
                "Contains 'plan' : " + containsPlan);

        System.out.println(
                "Valid Alphanumeric : " + valid);

        System.out.println(
                "HashCodes equal for interned strings : " + hashCodesEqual);

        sc.close();
    }
}
