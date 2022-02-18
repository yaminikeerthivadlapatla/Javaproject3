import java.util.*;
public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your marks");
		Scanner num=new Scanner(System.in);
		float marks=num.nextFloat();
		if(marks>=1 &&  marks<=100) {
			if(marks>=90)
				System.out.println("Grade A and Excellent");
			else if(marks>=80 && marks<90) {
				System.out.println("Grade B and Very Good");
			}
			else if(marks>=70 && marks<80) {
				System.out.println("Grade C and Good");
			}
			else if(marks>=60 && marks<70) {
				System.out.println("Grade D and Satisfactory");
			}
			else if(marks>=50 && marks<60) {
				System.out.println("Grade E and Work Hard");
			}
			else if(marks>=40 && marks<50) {
				System.out.println("Grade F and Just Passed");
			}
			else {
				System.out.println("Grade is Failed");
			}
		}
		else
		{
			System.out.println("Please enter the markes between 1 to 100");;
		}
		
		

	}

}
