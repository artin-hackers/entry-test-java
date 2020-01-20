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

        if (checkPalindrome(multipleString)) {
            System.out.println("The number " + multiple + " is a palindrome.");
        }
        else {
            System.out.println("The number " + multiple + " is NOT a palindrome.");
        }

        System.out.println("Finished");
    }

    private static boolean checkPalindrome(String multipleString) {
        if (multipleString.charAt(0) != multipleString.charAt(3)) {
            return false;
        }

        if (multipleString.charAt(1) != multipleString.charAt(2)) {
            return false;
        }
        return true;
    }
}
