public class palindrom {
    public static void main(String[] args) {
        //   System.out.println("Hello world");

        int x = 91;
        int i = 99;
        int number;
        number = x * i;
        System.out.println(number);
        String text;
        text = Integer.toString(number);

      System.out.println(checkpalindrom(text));

        checkpalindrom(text);


    }

    private static boolean checkpalindrom(String text) {
        if (text.charAt(0) == text.charAt(3)) {
        } else {

            return false;
        }

        if (text.charAt(1) == text.charAt(2)) {
        } else {

            return false;
        }
          return true;
    }

}

