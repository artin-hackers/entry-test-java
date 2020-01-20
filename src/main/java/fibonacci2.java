import java.util.Scanner;

public class fibonacci2 {

    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
         System.out.print("enter low limit:");
         String lowLimitStr = scanner.nextLine();
         System.out.println("enter high limit: ");
         String highLimitStr = scanner.nextLine();

         Integer lowLimit = Integer.parseInt(lowLimitStr);
         Integer highLimit = Integer.parseInt(highLimitStr);

        if (highLimit < lowLimit) {
            System.out.println("error");
            System.exit(-1);
        }

        else if (lowLimit <= 0|| highLimit <=0 ){
            System.out.println("error");
            System.exit(-1);
        }
     System.out.println("you entered <"+lowLimitStr+","+highLimitStr+">");


      Integer lastLast = 0;
      Integer last = 1;
      for (int i = 3;i <= highLimit;i++){
      Integer current = last + lastLast;
      if(i >=lowLimit) {
         System.out.println(i + "." + current);
     }
      lastLast = last;
      last = current;





            }
       }
    }

