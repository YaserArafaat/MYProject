package guvi;

import java.util.Scanner;

public class rev_a_digit {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("enter the number of digits : ");
	int len=in.nextInt();
	System.out.println("enter the number : ");	
	
	
	int num=in.nextInt();
	int backup=num,p=0;
	int []arr=new int[len];
	while(num!=0)
	{
		int remain=num%10;
		arr[p]=remain;
		 num=num/10;
		p++;		
	}
	String str=new String();
	for(int i=0;i<arr.length;i++)
	{
	 str+=String.valueOf(arr[i]);
	}
	System.out.println(str);
}
}
