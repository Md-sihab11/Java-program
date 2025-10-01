
import java.util.Scanner;

public class Display_max {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("ENter values: ");
    int A = in.nextInt();
    int B = in.nextInt();
    int C = in.nextInt();

    int max = A;
    if(max<B)
    {
      max=B;
    }
      if(max<C)
    {
      max=C;
    }

    System.out.println("Max value: "+max);


  }

}
