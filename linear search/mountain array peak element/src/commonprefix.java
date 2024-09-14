import java.util.List;

public class commonprefix {

    public static void main(String[] args) {
        // Example usage
        List<String> strings = List.of("flower", "flow", "flight");
        String commonPrefix = findLongestCommonPrefix(strings);
        System.out.println("Longest Common Prefix: " + commonPrefix);
    }

    // Function to find the longest common prefix among a list of strings
    private static String findLongestCommonPrefix(List<String> strings) {
        if (strings == null || strings.isEmpty()) {
            return "";
        }

        // Take the first string as the reference for comparison
        String reference = strings.get(0);

        for (int i = 0; i < reference.length(); i++) {
            char currentChar = reference.charAt(i);

            // Check if the current character is common among all strings
            for (String str : strings) {
                if (i >= str.length() || str.charAt(i) != currentChar) {
                    // Common prefix ends here
                    return reference.substring(0, i);
                }
            }
        }

        // Entire reference string is a common prefix
        return reference;
    }
}

