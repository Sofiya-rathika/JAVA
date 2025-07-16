package whileloop;


import java.util.Scanner;

public class FirstFiveDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int end=sc.nextInt();
		int num=1;
		int count=0;
		
		while(count<end) {
			if(num%2==0 && num%3==0 && num%5==0) {
				System.out.println(num);
				count++;
			}
			num++;
		}
		
	}

}
