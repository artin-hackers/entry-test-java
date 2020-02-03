public class palindrom {
    public static void main(String[] args) {
        //   System.out.println("Hello world");

        for (int i = 1000; i <=9999; i++) {
            String string;
            string = Integer.toString(i);
            if (checkpalindrom(string) == true) {
                System.out.println(string);
            }
        }

    //if()




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

