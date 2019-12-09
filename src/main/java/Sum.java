import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer target = 0;
        Boolean successfully_loaded = false;
        while (!successfully_loaded) {
            System.out.print("Target number: ");
            try {
                target = Integer.parseInt(scanner.nextLine());
            }
            catch (NumberFormatException nfe) {
                System.out.print("Invalid input. Target must be an integer!\n");
                continue;
            }
            if (target < 0) {
                System.out.print("Invalid input. Target must be a positive number!\n");
                continue;
            }
            else {
                successfully_loaded = true;
            }
        }
        Integer sum = 0;
        for (int i = 1; i <= target; i++) {
            sum += i;
        }
        System.out.println("Sum is " + Integer.toString(sum));
    }
}
