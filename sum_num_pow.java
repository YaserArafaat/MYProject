package guvi;

import java.util.Scanner;

public class sum_num_pow {
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

	for(int i=arr.length-1;i>=0;i--)
	{	
			sum+=(int)Math.pow(arr[i], arr[0]);
		
	}
	System.out.println(sum);
	
}

}
