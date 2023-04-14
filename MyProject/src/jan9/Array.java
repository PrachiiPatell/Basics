package jan9;

import java.util.Scanner;

public class Array {
	public static void main(String args[])
	{
		int a[]=new int[5];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Array Elements:");
		for(int i=0;i<5;i++)
		{
			a[i]=s.nextInt();
		}
		for(int b:a) {
			System.out.println			
			("Array elements are:" +b);
		}
		
	}

}
