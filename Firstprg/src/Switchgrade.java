import java.util.Scanner;
public class Switchgrade{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
			System.out.println("Enter Score");
			int score=s.nextInt();
		switch(score/10) {
		case 9:
			System.out.println("Grade A");
			break;
		case 8:
			System.out.println("Grade B");
			break;
		case 7:
			System.out.println("Grade C");
			break;
	    case 6:
		System.out.println("Grade D");
		break;
	    case 5:
	    	System.out.println("Grade E");
				break;
	    case 4:
	    	System.out.println("Grade F");
				break;
	    default:
	    	System.out.println("Grade is Failed");
			}
		}
	}


