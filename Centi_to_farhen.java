
import java.util.Scanner;
public class Centi_to_farhen {
    
   // F = 9/5 * C +32;
   // C = 5/9*(F-32);

   public static void main(String[] args) {

      //centi to far
      java.util.Scanner in = new Scanner(System.in);
      int C=in.nextInt();
      double F = 9/5 * C +32;
      System.out.println("Current FAr: "+F);

      //Far to centi
       int Far = in.nextInt();
      double c = 5.0/9 * (Far-32);
      System.out.println("Current Cel : "+c);
 
   }
}
