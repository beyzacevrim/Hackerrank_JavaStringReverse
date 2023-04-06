public class ReverseString {
    public static void main(String[] args) {
        // Declare and initialize a string variable with a value
        String inputString = "When you use a character escape " +
                "sequence in a Java string, the actual character represented by the " +
                "escape sequence is included in the string.";

        // Print the length and value of the input string to the console
        System.out.println("***  Length of input string : " + inputString.length());
        System.out.println("Input string: " + inputString);
        System.out.println();

        // Call the reverseString method to reverse the input string
        String reversedOutput = reverseString(inputString);

        // Print the length and value of the reversed string to the console
        System.out.println("***  Length of reversed string: " + reversedOutput.length());
        System.out.println("Reversed string: " + reversedOutput);
    }

    // Reverses a string using a StringBuilder object
    private static String reverseString(String input) {
        StringBuilder sb = new StringBuilder(input); // Create a StringBuilder object with the input string
        return sb.reverse().toString(); // Reverse the StringBuilder object and convert it to a string
    }
}
