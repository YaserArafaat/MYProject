package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class pro_arr {
	public static void main(String[] args) {
		
	
	System.out.println("enter the length of  array : ");	
	Scanner in=new Scanner(System.in);
	
	int len=in.nextInt();
	
	int []arr=new int[len];
	System.out.println("enter the elements one by one : ");
	for(int i=0;i<len;i++)
	{
		arr[i]=in.nextInt();
	}
	Arrays.sort(arr);
	for(int i=arr.length-1;i>=0;i--)
	{
		System.out.println(arr[i]);
	}
	
	
}
}
