package array;

import java .util.Scanner;


class A{
 int check (int[] b,int r){
	 
	 
	 for(int i=0;i<b.length;i++) {
		 
	 if(b[i]==r) {
		return i;
	 }
}
	 return -1;
}
 }
public class SearchArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int b[]=new int[m];
	
		
		for(int i=0;i<m;i++) {
			b[i]=sc.nextInt();
		}
		int r=sc.nextInt();
		
		A d=new A();
		System.out.println(d.check(b,r));
	}

}

