
import java.util.Scanner;

class Loop{
	public static void main(String[] args)
	{
		
		Scanner take = new Scanner(System.in);
		int num,i=0;
		System.out.print("Enter how many times : ");
		num = take.nextInt(); //ater opore diite hobe print line
		/**while(i<num)
		{
			System.out.println(i);
			i++;
		}
		
		//do while loop
		do{
			System.out.println(i);
			System.out.println("Shakib");
			i++;
		}while(i<num);
		
		
		
		for(int i=0; i<=num; i++)
		{
			System.out.println("Numbers: "+i);
		}
		take.close();*/
		
		//break and conntinue statement
		for(i=0; i<=num; i++)
		{
			if(i==4)continue;
			System.out.println("shakib"+i);
		}
	}
}