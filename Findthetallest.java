package examples;

import java.util.Arrays;
import java.util.Scanner;

public class Findthetallest {
	
public static void main(String args[])
{
	Scanner n=new Scanner(System.in);
	int size,k;
	System.out.println("Enter the size of the array");
	size=n.nextInt();
	int a[]=new int[size];
	System.out.println("\nEnter the heights of the class members");
	for(int i=0;i<size;i++)
	{
		a[i]=n.nextInt();
	}
	System.out.println("\nEnter the Kth element to search the tallest student");
	k=n.nextInt();
	Arrays.sort(a);
	for(int i=0;i<size;i++)
System.out.println(a[i]);
	System.out.println("\n The" +k+ "element is"+a[k]);
}
}
