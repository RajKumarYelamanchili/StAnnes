package interview_programs;
import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		//if you / by 10, you can ignore the last digit
		//if you % by 10, you can take the last digit
		
				
		Scanner obj1 = new Scanner(System.in);
		
		System.out.println("enter the number you want to reverse: ");
		int num = obj1.nextInt();
		int rev=0;
		
		while(num !=0)
		{
			rev = rev*10 + num%10;
			num = num/10;
		}
		System.out.println("reverse of num: " + rev);
		
		if (num == rev)
		{
		System.out.println("Palindrome");
		}
		else
		{
		System.out.println("not Palindrome");
		}

	}

}
