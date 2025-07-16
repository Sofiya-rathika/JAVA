package assignment;
  
import java.util.Scanner;

class Check{
	int n;
	Check(int n){
		this.n=n;
	}
	void show() {
		if(n%2!=0) {
			System.out.println("Odd Number");
		}
		else
		{
			System.out.println("Even Number");
		}
	}
}
public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		Check h=new Check(n);
		h.show();
	}

}
