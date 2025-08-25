
import java.util.Scanner;
class Control{
	public static void main(String[] args)
	{
		int a=10;
		if(a%2==0)
		{
			System.out.println("positive");
		}
		else if(0>a)
		{
			System.out.println("Hahah");
		}
		else{
			System.out.println("Negative");
		}
		Scanner take = new Scanner(System.in);
		int num;
		System.out.println("Enter Your choice: ");
		num = take.nextInt();
		
		switch(num)
		{
			case 1: 
			{
				System.out.println("Shakib\n");
				break;
			}
			case 2:
			{
				System.out.println("Alif\n");
				break;
			}
			default:
			{
				System.out.println("Wrong!!");
				break;
			}
		}
		
	}
}
