package guvi;

import java.util.Scanner;

public class sum_num {
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
	
	int sum=0;
	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			sum+=arr[i]+arr[j];
		}
	}
	System.out.println("the total is : "+sum);
}
}
