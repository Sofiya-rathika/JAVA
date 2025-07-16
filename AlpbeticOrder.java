package assignment;

import java.util.Scanner;
class Order{
	char s1;
	char s2;
	
	Order(char s1,char s2){
		this.s1=s1;
		this.s2=s2;
	}
	
	void show() {
		if(s1<s2) {
			System.out.println(s1+" , "+s2);
		}
		else {
			System.out.println(s2+" , "+s1);
		}
	}
}
public class AlpbeticOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char s1=sc.next().charAt(0);
		char s2=sc.next().charAt(0);
		
		Order v=new Order(s1,s2);
		v.show();
		
	}

}
