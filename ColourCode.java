package assignment;


import java.util.Scanner;
public class ColourCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//         char B;
//         char R,W,Y,G,O;
         
         Scanner sc=new Scanner(System.in);
         char ch=sc.next().charAt(0);
         
         switch(ch) {
         case 'B':
        	 System.out.println("Blue");
        	 break;
         case'R':
        	 System.out.println("Red");
        	 break;
         case'Y':
        	 System.out.println("Yellow");
        	 break;
         case'G':
        	 System.out.println("Green");
        	 break;
         case'W':
        	 System.out.println("White");
        	 break;
         case'O':
        	 System.out.println("Orange");
        	 break;
        	 default:
        		 System.out.println("Enter valid letter in uppercase! or Enter valid letter.");
         }
         
	}

}
