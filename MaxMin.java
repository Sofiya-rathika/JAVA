package array;

import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int a[]=new int[k];
		
		
		for(int i=0;i<k;i++) {
			a[i]=sc.nextInt();
		}
		
		int max=a[0];
		int min=a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
			 if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("Maximum Value : "+ max);
		System.out.println("Minimum Value : "+ min);
	}

}
