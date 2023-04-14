package jan6;
import java.util.Scanner;
public class Calculator {
	
     public static void main(String args[]) 
     {
    	 int a,b,c,ch;
    	 System.out.println("Enter two numbers:");
    	 Scanner s=new Scanner(System.in);
    	 a=s.nextInt();
    	 b=s.nextInt();
    	
    	 System.out.println("Enter choice:");
    	 ch=s.nextInt();
    	 switch(ch) {
    	 case 1:c=a+b;
    	 System.out.println("Addition is:" +c);
    	 break;
    	 case 2:c=a-b;
    	 System.out.println("Subtraction is:" +c);
    	 break;
    	 case 3:c=a/b;
    	 System.out.println("Division is:" +c);
    	 break;
    	 case 4:c=a%b;
    	 System.out.println("Remainder is:" +c);
    	 break;
    	 case 5:c=a*b;
    	 System.out.println("Multiplication is:" +c);
    	 break;
    	 default:System.out.println("Invalid");
    	 }	 
     }
}
