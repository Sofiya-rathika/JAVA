package assignment;


import java.util.Scanner;
public class FloydsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int k=sc.nextInt();
		int a=0;
		for(int i=0;i<k;i++) {
			for(int j=0;j<=i;j++) {
				 a=a+1;
				System.out.print(a+" ");
			}
			System.out.println( );
		}
	}

}
