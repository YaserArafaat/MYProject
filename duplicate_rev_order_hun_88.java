package guvi;

import java.util.Scanner;

public class duplicate_rev_order_hun_88 {
public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	String mi=obj.next();
	StringBuffer mine=new StringBuffer(mi);
	mine.reverse();
	char []arr=mine.toString().toCharArray();
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]);
	}
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
			{
			if((int)arr[i]==(int)arr[j])
			{
				arr[i]='@';
				break;
			}
			}
	}System.out.println();
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]!='@')
		{
			
			System.out.print(arr[i]);
		}
	}
	
}
}
