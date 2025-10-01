import java.util.Scanner;

public class Dec_to_Octal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Decimal value");
        int decimal = input.nextInt();

        String octal = Integer.toOctalString(decimal);
        System.out.println("Octal value: "+octal);


        //oct --> decimal
        System.out.println("Enter a Octal value");
        String octal_in = input.next();
        int OC_to_dec = Integer.parseInt(octal_in, 8);
        System.out.println("Decimals: "+OC_to_dec);
    }

    
}








/*
 Integer.parseInt(String s, int radix)


radix = 2 → Binary

radix = 8 → Octal

radix = 10 → Decimal

radix = 16 → Hexadecimal
 */
