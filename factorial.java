package guvi;

public class factorial {
public static void main(String[] args) {
	int num=5;
	int sum=num;
	int back=--num;
	while(back!=0)
	{
		sum=sum*back;
		back--;
	}
	System.out.println(sum);
}
}
