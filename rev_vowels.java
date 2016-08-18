package guvi;

public class rev_vowels {
public static void main(String[] args) {
StringBuffer str=new StringBuffer("yaser");
	
	str.reverse();
	System.out.println(str);
	String n=str.toString();
	char []vowels={'a','e','i','o','u'};
	char []vo=n.toCharArray();
	for(int i=0;i<vo.length;i++)
	{
		for(int j=0;j<vowels.length;j++)
		{
			if((int)vo[i]==(int)vowels[j])
			{
				vo[i]='@';
			}
		
	}
	for(int i=0;i<vo.length;i++)
	{
		if(vo[i]!='@')
		{
			System.out.print(vo[i]);
		}
	}
}
}
