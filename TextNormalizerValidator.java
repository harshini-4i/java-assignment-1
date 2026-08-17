public class TextNormalizerValidator {

    public static String processText(String input) {

        String result = input.trim();

        result = result.strip();

        if (result.isEmpty()) {
            return "Empty String";
        }

        if (result.equalsIgnoreCase("admin")) {
            return "Reserved Word";
        }

        result = result.replace(" ", " ");

        String lower = result.toLowerCase();

        if (lower.startsWith("temp") && lower.endsWith("user")) {
            result = result.concat(" Flagged");
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println(processText(" temp_dedeepya_user "));
        System.out.println(processText(" Admin "));
        System.out.println(processText(" "));
    }
}