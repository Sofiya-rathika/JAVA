package array;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner sc = new Scanner(System.in);
		        int k=sc.nextInt();

		        int[] arr = new int[k];
		        
		      
		        
		        for (int i = 0; i < k; i++) {
		            arr[i] = sc.nextInt();
		        }
		        if (arr.length == 4) {
		          
		        System.out.println("Given array :");
		        System.out.println(arr[0] + " " + arr[1]);
		        System.out.println(arr[2] + " " + arr[3]);

		      
		        System.out.println("Reverse array :");
		        System.out.println(arr[3] + " " + arr[2]);
		        System.out.println(arr[1] + " " + arr[0]);

		        //sc.close();
		    }
		        else {
		        	 System.out.println("Please enter 4 integer numbers");
			            return;
			        
		        }
	}
		

	}


