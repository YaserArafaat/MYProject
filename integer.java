import java.util.Scanner;
public class integer {
public static void main(String[] args) {
	int n,i;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter total no of values in the array : ");
	n=s.nextInt();
	int a[]=new int[n];
	System.out.println("enter  elements one by one : ");
	for(i=0;i<n;i++)
	{
		
	a[i]=s.nextInt();
	}
	for( i=0;i<n;i++)
	{
	if(a[i]==i)
	{
		System.out.println(a[i]);
	}

	}
}
}
