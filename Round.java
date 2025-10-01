public class Round {
    //celi, trunc, floor, round

    public static void main(String[] args) {

        double d =5.1;
        System.out.println("Celi: "+ Math.ceil(d)); //6
        System.out.println("Celi: "+ Math.floor(d));
         System.out.println("Celi: "+ Math.round(d));
        System.out.println("TRanc: "+(int)d);
    }
}






/*

celi: 
positive hole :
5.1 → 6
5.9 → 6
Neg:
-5.1 → 5
-5.9 → 5

Truncate: 

-5.1 → -5
5.9 → 5

Floor: 
5.1 → 5
5.9 → 5
round:
0.5 
5.1 → 5
5.9 → 6

*/
