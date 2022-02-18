import java.util.*;
public class Vowel {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter alphabet:");
		char v=s.next().charAt(0);
		{
		switch(v) {
		case 'a':
			System.out.println("It is an vowel");
			break;
		case 'e':
			System.out.println("It is an vowel");
			break;
		case 'i':
			System.out.println("It is an vowel");
			break;
		case 'o':
			System.out.println("It is an vowel");
			break;
		case 'u':
			System.out.println("It is an vowel");
			break;
			default:
			System.out.println("Entered alphabet is not a vowel");
		}
	}
 }
}
