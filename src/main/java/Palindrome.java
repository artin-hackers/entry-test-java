public class Palindrome {
    public static void main(String[] args) {
        int a;
        int b;

        a = 90;
        b = 99;

        int multiple;

        multiple = a * b;

        String multipleString;

        multipleString = Integer.toString(multiple);

        System.out.println(multipleString);
        if (checkPalindrome(multipleString)) return;

        System.out.println("Finished");
    }

    private static boolean checkPalindrome(String multipleString) {
        // Check palindrome - Level 1
        if (multipleString.charAt(0) == multipleString.charAt(3)) {
            System.out.println("Level 1 - Match");
        }
        else {
            System.out.println("Level 1 - Difference");
            return true;
        }

        // Check palindrome - Level 2
        if (multipleString.charAt(1) == multipleString.charAt(2)) {
            System.out.println("Level 2 - Match");
        }
        else {
            System.out.println("Level 2 - Difference");
            return true;
        }
        return false;
    }
}
