package array;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSmallAndLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int g[]=new int[m];
		
		for(int i=0;i<m;i++) {
			g[i]=sc.nextInt();
		}
//		int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
//        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
//
//        for (int i = 0; i < m; i++) {
//            // Check for max1 and max2
//            if (g[i] > max1) {
//                max2 = max1;
//                max1 = g[i];
//            } else if (g[i] > max2 && g[i] != max1) {
//                max2 = g[i];
//            }
//
//            // Check for min1 and min2
//            if (g[i] < min1) {
//                min2 = min1;
//                min1 = g[i];
//            } else if (g[i] < min2 && g[i] != min1) {
//                min2 = g[i];
//            }
//        }
		
		Arrays.sort(g);
		System.out.println("Minimum 1 : "+g[0]);
		System.out.println("Minimum 2 : "+g[1]);
		System.out.println("Maximum 1 : "+g[m-1]);
		System.out.println("Maximum 2 : "+g[m-2]);
	}

}
