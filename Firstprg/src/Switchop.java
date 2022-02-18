import java.util.*;
public class Switchop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value of a:");
		a=s.nextInt();
		System.out.println("Enter value of b:");
		b=s.nextInt();
		System.out.println("Enter an operator:");
		char op=s.next().charAt(0);
		switch(op)
		{
		case '+':
			System.out.println("add:"+(a+b));
			break;
		case '-':
			System.out.println("sub:"+(a-b));
			break;
		case '*':
			System.out.println("mul:"+(a*b));
			break;
		case '/':
			System.out.println("div:"+(a/b));
			break;
		}
		

	}

}
