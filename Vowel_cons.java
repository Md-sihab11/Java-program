import java.util.*;

public class Vowel_cons {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'||ch=='A'){
            System.out.println(ch + " is a Vowel");
        } else if((ch >= 'a' && ch <= 'z')){
            System.out.println(ch + " is a Consonant");
        } else {
            System.out.println(ch + " is not an alphabet");
        }
    }
}
