//how to take inout from user 
import java.util.Scanner;

class inout{
	public static void main(String[] args)
	{
		Scanner take = new Scanner(System.in);
		int num;
		
		System.out.println("Enter the number: ");
		num = take.nextInt();
		
		take.nextLine();
		
		System.out.println("Enter the Strings: ");
		String Sentence = take.nextLine();
		
		System.out.println("Enter float numm: ");
		float f = take.nextFloat();
		
		System.out.println("Enter double: ");
		double d = take.nextDouble();
		
		System.out.println("Enter the single character: ");
		String ch = take.next();
		
		  
		System.out.println("The integer is: "+num);
		System.out.println("The Sen is: "+Sentence);
		System.out.println("The Float is: "+f);
		System.out.println("The Double is: "+d);
	}
}

/**import java.util.Scanner;

class InputTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        System.out.print("Enter a float: ");
        float f = sc.nextFloat();

        System.out.print("Enter a double: ");
        double d = sc.nextDouble();

        System.out.print("Enter a word: ");
        String word = sc.next(); // reads one word

        sc.nextLine(); // to consume leftover newline

        System.out.print("Enter a full sentence: ");
        String sentence = sc.nextLine(); // reads full line

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0); // reads first character

        System.out.println("\n--- Output ---");
        System.out.println("Integer: " + num);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        System.out.println("Word: " + word);
        System.out.println("Sentence: " + sentence);
        System.out.println("Character: " + ch);
    }
}*/
