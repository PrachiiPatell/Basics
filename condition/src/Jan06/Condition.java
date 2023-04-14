//import java.util.Scanner;

package Jan06;
//import java.util.Scanner;
//public class Condition {
//	public static void main(String args[]) {
//	int marks;
//	System.out.println("Enter marks");
//	Scanner obj=new Scanner(System.in);
//	marks=obj.nextInt();
//	if(marks==40) {
//		System.out.println("First Division");
//	}
	//else if(marks<50)
//	{
 //     System.out.println("Second Division");
//	}
//	else {
//		System.out.println("Fail");
//	}
//		
//	}

//}
import java.util.Scanner;
public class Condition {
	public static void main(String args[])
	{
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		System.out.println("Enter Number:" +n);
		
	while(n>=0) {
		if(n%2==0)
		{
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
		
	}
	}
}
