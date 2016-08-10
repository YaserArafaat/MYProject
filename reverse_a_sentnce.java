package guvi;

public class reverse_a_sentnce {
public static void main(String[] args) {
	String str="hai how are you";
	String []arr=str.split(" ");
	StringBuffer [] rev=new StringBuffer[arr.length];
	
	for(int i=0;i<arr.length;i++)
  	{
		StringBuffer one=null;
		one=new StringBuffer(arr[i]);
		one.reverse();
		rev[i]=one;
		
		
	}
	for(int i=0;i<rev.length;i++)
	{
		System.out.print(rev[i]+" ");
	}
	
}
}
