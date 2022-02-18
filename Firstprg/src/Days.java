import java.util.*;
public class Days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter input:");
		int day=s.nextInt();		
		switch(day) {
		case 9:
			System.out.println("Monday");
			break;
		case 8:
			System.out.println("Tuesday");
			break;
		case 7:
			System.out.println("Wednesday");
			break;
		case 6:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		default:
			System.out.println("Saturday");
			break;
		}

	}

}
