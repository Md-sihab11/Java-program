import java.util.Scanner;
public class Factorial {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the range: ");
        int Num = in.nextInt();

        int Fact=1;
        int sum=0;
        for(int i=1; i<=Num; i++)
        {
            Fact=Fact*i; //1+2+6+24+
            sum=sum+Fact;//1,3,9,
        }

        System.out.println("Factorial: "+Fact);
        System.out.println("Sum: "+sum);



    }
}

//1!+2!+3!+4!+5!............=