package guvi;

import java.util.Scanner;

public class square {
public static void main(String[] args) {
		int str[]=new int[8];
		Scanner in=new Scanner (System.in);
		System.out.print("enter the position (8) : ");
		for(int i=0;i<8;i++)
		{
		 str[i]=in.nextInt();
		}
		int size=Math.abs(str[1]-str[4]);
		if(Math.abs(str[2]-str[6])==size &&Math.abs(str[5]-str[6])==size&&Math.abs(str[4]-str[0])==size)
		{
			System.out.println("forms square....");
		}
		else
		{
			System.out.println("not forms square...");
		}
		
		}
}
