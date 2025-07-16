package whileloop;

import java.util.Scanner;

public class PalindromeSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int copy=num;
		int rev=0;
		while(num!=0) {
			int rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		if(copy==rev) {
			System.out.println("Palindrome");
		}
		
		else
		{
			System.out.println("Not a Palindrome.");
		}
	}

}
