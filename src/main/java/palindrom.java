public class palindrom {
    public static void main(String[] args) {
   //   System.out.println("Hello world");

    int  x = 91;
    int  i = 99;
    int number;
    number = x*i;
    System.out.println(number);
    String text;
    text = Integer.toString(number);


        checkpalindrom(text);


    }

    private static void checkpalindrom(String text) {
        if (text.charAt(0) ==text.charAt(3)){
        System.out.println("true");
        }
        else {
            System.out.println("false");
            return;
        }

        if (text.charAt(1) ==text.charAt(2)){
        System.out.println("true2");
        }
        else {
            System.out.println("false2");
            return;
        }
    }
}
