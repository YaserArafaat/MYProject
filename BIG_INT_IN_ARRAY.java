package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class BIG_INT_IN_ARRAY {
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
	Arrays.sort(arr);
	String str="";
	for(int i=0;i<arr.length;i++)
	{
		str+=String.valueOf((arr[i]));
	}
	StringBuffer str1=new StringBuffer(str);
	str1.reverse();
	System.out.println(str1);
}
}
