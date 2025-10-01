public class D_TO_O {
    public static void main(String[] args) {

       // Deci to Oct
        int dec=10;
        String D_O =  Integer.toOctalString(dec);
        System.out.println("Deci to Oct: "+D_O);

        //OCt to deci
        String oct="12";
        int  O_D =   Integer.parseInt (oct,8);
        System.out.println("OCt to deci: "+O_D);
    }
    
}
/*
datatype var =Integer.parseInt(String s, int radix)


radix = 2 → Binary

radix = 8 → Octal

radix = 10 → Decimal

radix = 16 → Hexadecimal
 */
