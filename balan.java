package guvi;

import java.util.Scanner;

public class balan {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int sum=0,sum1=0,count2=0;
	String s=sc.nextLine();
	String [] q=s.split(" ");
	
	for(int j=0;j<q.length;j++)
	{
		char a[]=q[j].toCharArray();
		if(a.length%2!=0)
		{
			System.out.println(q[j]+" is not balanced");
			continue;
		}
		for(int i=0;i<a.length;i++)
		{
		if((a[i]>='a'&&a[i]<='m')||(a[i]>='A'&&a[i]<='M'))
		{
			sum++;
		}
		else if((a[i]>='n'&&a[i]<='z')||(a[i]>='N'&&a[i]<='Z'))
		{
			sum1++;
		}
		}
	if(sum==sum1)
	{
		System.out.println(q[j]+" balanced");
	}
	else
	{
		System.out.println(q[j]+" not balanced");
	}
}
}}
