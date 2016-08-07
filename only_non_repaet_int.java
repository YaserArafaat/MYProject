package guvi;

import java.util.Scanner;

public class only_non_repaet_int {
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
				arr[i]='@';
				arr[j]='@';
				break;
			}
		}
	}
	for(int i=0;i<len;i++)
	{
		if(arr[i]!='@')
		{
	System.out.println(arr[i]);
		}
	}
	}
}
