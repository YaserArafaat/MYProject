package guvi;

public class remove_str {
public static void main(String[] args) {
	String str="AbdW123Sd";
	char []arr=new char[str.length()];
	char []output=new char[str.length()];
	int p=0;
	char[]spl=str.toCharArray();
	for(int i=0;i<spl.length;i++)
	{
		int b=(int)spl[i];
		if((b>=65)&&(b<=90))
		{
			spl[i]='@';
		}
		else if((b>=97)&&(b<=122))
		{
			spl[i]='@';
		}
		else
		{
			output[p]=spl[i];
			p++;
		}
	}
	for(int i=0;i<spl.length;i++)
	{
		System.out.print(output[i]);
	}
	
}


}
