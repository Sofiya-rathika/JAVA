package assignment;

import java.util.Scanner;

public class SumSeriesInLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     
      

        int num=sc.nextInt();
        int sum = 0;

      
        for (; num != 0; num = num / 10) {
            sum += num % 10; 
        }
        System.out.println( sum);
      
    }
}
