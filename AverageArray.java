package array;
 import java.util.Scanner;
 
public class AverageArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int num[]=new int[k];
		int a=0,x=0;
		int count=0;
		
		for(int i=0;i<k;i++) {
			num[i]=sc.nextInt();
			count++;
		}
		
		for(int i=0;i<k;i++) {
			a=num[i]+a;
		}
		System.out.println("Sum : "+ a);
		x=a/count;
		System.out.println("Average : "+x);
	}

}
