import java.util.*;
public class Operatorchoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		do {
		System.out.println("Enter \n1-add \n2-sub \n3-mul \n4-div");
		int num=s.nextInt();
		int a,b;
		System.out.println("Enter value of a:");
		a=s.nextInt();
		System.out.println("Enter value of b:");
		b=s.nextInt();
		if(num>0)
		{
			switch(num)
			{
			case 1:
				System.out.println("Addition");
				int add=a+b;
				System.out.println("add");
				break;
			case 2:
				System.out.println("Subtraction");
				int sub=a-b;
				System.out.println("sub");
				break;
		    case 3:
				System.out.println("Multiplication");
				int mul=a*b;
				System.out.println("mul");
				break;
			case 4:
				System.out.println("Division");
				int div=a/b;
				System.out.println("div");
				break;
			default:
				 System.out.println("entered the Wrong operator\n");
			}
		}
	}
		while(true);
}
}