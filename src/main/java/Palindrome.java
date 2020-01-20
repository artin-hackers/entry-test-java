public class Palindrome {
    public static void main(String[] args) {
        int a;
        int b;

        a = 52;
        b = 31;

        int multiple;

        multiple = a * b;

        String multipleString;

        multipleString = Integer.toString(multiple);

        System.out.println(multipleString);

        // Check palindrome - Level 1
        if (multipleString.charAt(0) == multipleString.charAt(3)) {
            System.out.println("Level 1 - Match");
        }
        else {
            System.out.println("Level 1 - Difference");
        }

    }
}
