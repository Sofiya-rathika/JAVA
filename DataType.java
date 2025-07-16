package assignment;

import java.util.Scanner;

class Letter{
	
	char G;
	
	Letter(char G){
		
		this.G=G;
	}
	void check() {
		if((G >= 'a' && G <= 'z') || (G >= 'A' && G <= 'Z')) {
			System.out.println("Alphabets");
		}
		else if(G>='0' && G<='9') {
			System.out.println("Digit");
		}
		else {
			System.out.println("Special Character");
		}
	}
}

public class DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char G=sc.next().charAt(0);
		
		Letter a=new Letter(G);
		a.check();
		
		
		
	}

}
