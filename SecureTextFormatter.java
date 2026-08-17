public class SecureTextFormatter {
    public static void main(String[] args) {

        String fullName = " Dedeepya J ";
        String email = "dedeepyaj@example.com";
        String sentence = "Java Assignments programs";

        String[] names = fullName.trim().split(" ");

        String formattedName = "";

        for (String word : names) {
            formattedName += word.substring(0, 1).toUpperCase()
                    + word.substring(1).toLowerCase() + " ";
        }

        formattedName = formattedName.trim();

        int at = email.indexOf("@");

        String beforeAt = email.substring(0, at);
        String afterAt = email.substring(at);

        String maskedEmail = beforeAt.substring(0, 3)
                + "*".repeat(beforeAt.length() - 3)
                + afterAt;

        boolean validEmail = email.matches(
                "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}"
        );

        String[] words = sentence.split(" ");

        String reversedSentence = "";

        for (String word : words) {
            char[] chars = word.toCharArray();

            for (int i = chars.length - 1; i >= 0; i--) {
                reversedSentence += chars[i];
            }

            reversedSentence += " ";
        }

        int vowelCount = 0;

        for (char ch : sentence.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) {
                vowelCount++;
            }
        }

        String s1 = new String("Java");
        String s2 = new String("Java");

        System.out.println("Formatted Name : " + formattedName);
        System.out.println("Masked Email : " + maskedEmail);
        System.out.println("Valid Email : " + validEmail);
        System.out.println("Reversed Words : " + reversedSentence.trim());
        System.out.println("Vowel Count : " + vowelCount);
        System.out.println("Using == : " + (s1 == s2));
        System.out.println("Using equals() : " + s1.equals(s2));
    }
}