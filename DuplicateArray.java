package array;

import java.util.Scanner;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	        Scanner sc=new Scanner(System.in);
	        int d=sc.nextInt();
	        int num[]=new int[d];

	        for(int i=0;i<d;i++){
	            num[i]=sc.nextInt();
	        }
	       // int duplicate=0;
	        for(int i=0;i<d;i++){
	            for(int j=i+1;j<d;j++){
	                if(num[i]==num[j]){
	                    for(int k=j;k<d-1;k++){
	                    num[k]=num[k+1];
	                }
	                d--;
	                j--;
	            } 
	            }
	            System.out.print(num[i]+" ");
	        }
	        
	}

}
