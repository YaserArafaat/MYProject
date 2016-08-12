package guvi;

import java.util.Scanner;

public class pangram_checker {
public static void main(String[] args) {
	Scanner in=new Scanner (System.in);
	System.out.print("enter the string : ");
	String str=in.next();
	str.toLowerCase();
	
	char []arr=new char[26];
	int p=0;
	for(char a='a';a<='z';a++)
	{
		
		arr[p]=a;
		p++;
	}

	char []sin=str.toCharArray();
	int flag=0;
	if(sin.length<26)
	{
		System.out.println("its not a pangram");
	}
	else
	{
	for(int i=0;i<arr.length;i++)
	{
	if(String.valueOf(arr[i]).contains(String.valueOf(sin[i])))
	{
		flag=1;
	}}
	if(flag==1)
	{
		System.out.println("its a pangram..");
		
	}
	else
	{
		System.out.println("its not a pangram");
	}
	}
}
}	

