import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter low limit: ");
        String lowLimitStr = scanner.nextLine();
        System.out.print("Please enter high limit: ");
        String highLimitStr = scanner.nextLine();

        Integer lowLimit = Integer.parseInt(lowLimitStr);
        Integer highLimit = Integer.parseInt(highLimitStr);

        if (highLimit < lowLimit) {
            System.out.println("Error: High limit must be the same or higher number than low limit");
            System.exit(-1);
        }
        else if (lowLimit <= 0 || highLimit <= 0) {
            System.out.println("Error: Both limits must be higher than 0");
            System.exit(-1);
        }

        System.out.println("You entered limit <" + lowLimitStr + ", " + highLimitStr + ">");

        Integer lastLast = 0;
        Integer last = 1;
        for (int i = 3; i <= highLimit; i++) {
            Integer current = last + lastLast;
            if (i >= lowLimit) {
                System.out.println(i + ". " + current);
            }
            lastLast = last;
            last = current;
        }

    }
}
