package guvi;

import java.util.Scanner;

public class sum_middle_num_in_arr {
	public static void main(String[] args) {
		
	
	System.out.println("enter the length of 2d array : ");	
	Scanner in=new Scanner(System.in);
	
	int len=in.nextInt();
	
	int [][]arr=new int[len][len];
	System.out.println("enter the elements one by one : ");
	for(int i=0;i<len;i++)
	{
		for(int J=0;J<len;J++)
		{
		arr[i][J]=in.nextInt();
		}
	}
	int sum=0;

	
		for(int i=1;i<len-1;i++)
		{
			for(int j=1;j<len-1;j++)
			{
				sum=sum+arr[i][j];
			}
			
		}
		System.out.println(sum);
	}
	
}
