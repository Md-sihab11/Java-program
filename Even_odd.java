
import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.println("Enter the value: ");
      int A = input.nextInt();

      if(A%2==0)
      {
        System.out.println("Even");
      }
      else
      {
        System.out.println("ODD");
      }
    }
}
