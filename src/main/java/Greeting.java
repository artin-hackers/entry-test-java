import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your name: ");
        name = scanner.nextLine();
        System.out.println("Hello " + name);
    }
}
