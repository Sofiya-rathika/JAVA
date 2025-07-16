package assignment;

import java.util.Scanner;
class Welcome{
	String name;
	Welcome(String name){
		this.name=name;
	}
	void delay() {
		System.out.println("Welcome "+name);
	}
}
public class WelcomeString {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String name=sc.nextLine();
	Welcome a=new Welcome(name);
	a.delay();
}
}
