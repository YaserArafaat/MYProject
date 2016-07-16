
public class repaeting_str {

		public static void main(String[] args) {
		String myString="ma     layalam";
	    char frst=' ';
	    int count=0;
		char []arr=myString.toCharArray();
		for(int j=0;j<myString.length();j++)
		{
			frst=arr[j];
			for(int t=j+1;t<myString.length();t++)
			{
				if(frst==arr[t])
				{
					arr[t]=1;
					
					
				}
				else{
					continue;
				}
				
			}
		
			
		}
		for(int y=0;y<myString.length();y++)
		{
			if(arr[y]==1)
			{
				count++;
				continue;
				
			}
			else
			{
				System.out.print(arr[y]);
				
			}
			
		}
		System.out.println();
		
		System.out.println(count);
	}

}
