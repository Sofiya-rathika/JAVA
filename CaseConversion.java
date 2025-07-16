package assignment;

import java.util.Scanner;
class Convert{
	char c;
	 Convert(char c) {
		 this.c=c;
	 }
	 
	 void run() {
		 if(c>='a' && c<='z' ) {
			 System.out.println((char)(c-32));
		 }
		 else if(c>='A' && c<='Z') {
			 System.out.println((char)(c+32));
		 }
		 else {
			 System.out.println("Enter valid Alphabets.");
		 }
	 }
}



public class CaseConversion {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	 char c=sc.next().charAt(0);
	 
	 Convert b=new Convert(c);
	 b.run();
	}

}
