import java.util.Scanner;
public class Letter_grade {
    public static void main(String[] args) {

         Scanner input = new Scanner(System.in);

      System.out.println("Enter Your Marks: ");
      int Marks = input.nextInt();
      String Grade="";
        
      switch(Marks/10)
      {

        case 0:
        case 1:
        case 2:
        case 3:
        if(Marks>=33)
        {
            Grade="D";
        }
        else{
            Grade="Fail";
        }
        break;
        
        case 4:
        Grade="C";
        break;
        case 5:
        Grade ="B";
        break;
        case 6:
        Grade ="A-";
        break;
        case 7:
        Grade ="A";
        break;

        case 8:
        Grade ="A+";
        break;

        case 9:

        case 10:
         Grade ="A+";
         break;

        default:
        {
            Grade = "Invalid input";
            break;
        }
      }

      System.out.println("Your Grade is : "+ Grade);
    }
}
