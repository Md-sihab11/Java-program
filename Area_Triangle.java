
public class Area_Triangle {

    public static void main(String[] args) {

        //Triangle = 1/2 *Base*Hight;
        //Triangle = 1/2 *Base*Hight * sin();
        double Base=5;
        double Hight=14.0;
        double Deg=30.0;

        double Rad = Math.toRadians(Deg);
        double value = Math.sin(Rad);
       
        System.out.printf("TRI RES: %.2f",1.0/2*Base*Hight*value);


    }
}
