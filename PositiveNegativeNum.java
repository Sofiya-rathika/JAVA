package assignment;

import java.util.Scanner;
class Method{
	int num;
	Method(int num){
		this.num=num;
	}
	void check() {
		if(num>0) {
			System.out.println("Positive Number");
		}
		else if(num<0) {
			System.out.println("Negative Number");
		}
		else
		{
			System.out.println("Zero");
		}
	}
}
public class PositiveNegativeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		Method b=new Method(num);
		b.check();
	}

}
