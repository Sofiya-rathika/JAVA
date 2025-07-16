package array;

import java.util.Scanner;

public class AsciiToChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc=new Scanner(System.in);
		int k=sc.nextInt();
		int h[]=new int[k];
		
		for(int i=0;i<k;i++) {
			h[i]=sc.nextInt();
		}
		for(int num :h) {
			System.out.println((char)(num));
		}

	}

}
