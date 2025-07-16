package assignment;

import java.util.Scanner;
class Line1{
	String cmd1;
	String cmd2;
	 Line1(String cmd1,String cmd2) {
		this.cmd1=cmd1;
		this.cmd2=cmd2;
		}
	 void display() {
		System.out.println(cmd1 + " Technologies "+cmd2);
	
}
}
public class StringArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String cmd1=sc.nextLine();
		 String cmd2=sc.nextLine();
		 
		 Line1 a=new Line1(cmd1,cmd2);
		 a.display();
		 
		
	}
}
