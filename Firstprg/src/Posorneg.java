import java.util.*;
public class Posorneg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a num:");
		int num=s.nextInt();
		if(num>0) {
			System.out.println("It is positive number");
		}
		else if(num<0)
		{
			System.out.println("It is negative number");
		}
		else
		{
			System.out.println("Number is 0");
		}

	}

}
