package guvi;

import java.util.Scanner;

public class DIV_ARR {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] arr=new int[n];
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	int len=arr.length/2;
	int sum1=0;
	int sum2=0;
	for(int i=0;i<len;i++)
	{
		sum1+=arr[i];
	}
	for(int i=len;i<n;i++)
	{
		sum2+=arr[i];
	}
	if(sum1/len==sum2/(n-len))
	{
		System.out.println("equal and it is possible");
		
	}
	else
	{
		System.out.println("its not possible");
	}
	
}
}
