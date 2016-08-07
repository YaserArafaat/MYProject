package guvi;


import java.util.Arrays;
import java.util.Scanner;

public class frst_repeat {
public static void main(String[] args) {
	System.out.println("enter the length of array : ");	
	Scanner in=new Scanner(System.in);
	
	int len=in.nextInt();
	int []arr=new int[len];
	System.out.println("enter the elements one by one : ");
	for(int i=0;i<len;i++)
	{
		arr[i]=in.nextInt();
	}
	int b=0;
	for(int i=0;i<len;i++)
	{
		for(int j=i+1;j<len;j++)
		{
			if(arr[i]==arr[j])
			{
				b=arr[i];
				System.out.println(arr[i]);
				
				System.exit(0);
				
			}
			
		}
		
		
	}
	
}
}
