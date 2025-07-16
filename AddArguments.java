package assignment;


import java.util.Scanner;

class Sum{
	int a,b;
	Sum(int a,int b){
		this.a=a;
		this.b=b;
	}
	void add() {
		int c=a+b;
		System.out.println("The sum of "+a+" and "+b+" is "+c);
	}
}
public class AddArguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		Sum s=new Sum(a,b);
		s.add();
	}

}
