package array;

import java.util.Scanner;
public class IgnoranceOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int h[]=new int[k];
		
		for(int i=0;i<k;i++) {
			h[i]=sc.nextInt();
		}
		boolean ignore=false;
		int num=0;
		
		for(int i=0;i<k;i++) {
			if(h[i]==6) {
				ignore=true;
			}
			if(!ignore) {
				num=num+h[i];
			}
			
			if(h[i]==7 && ignore) {
				ignore=false;
			}
		}
		System.out.println(num);
		
	}

}
