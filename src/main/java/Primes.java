public class Primes {
    public static void main(String[] args) {
        int counter = 0;
        for (int number = 2; number <= 21; number++) {
            boolean divisible = false;
            for (int divisor = 2; divisor < number; divisor++) {
                if (number % divisor == 0)
                {
                    divisible = true;
                }
            }
            if (!divisible) {
                counter += 1;
            }
            if (counter == 6) {
                System.out.println(number);
                System.out.println("tohle je tvoje cislo");
                break;
            }
        }
    }
}



