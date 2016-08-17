
class frst {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number : ");
		int n=s.nextInt();
		int a=n;
		int count=0;
		int res=0;
		while(n!=0)
		{
			n=n/10;
			count++;
		}
		int arr[]=new int[count];
		for(int i=0;i<count;i++)
		{
			arr[i]=a%10;
			a=a/10;
		}
		for(int i=0;i<arr.length;i++)
		{
			if(i==0)
			{
				res=(int)(res+Math.pow(arr[i],0));
			}
			else
			{
				res=(int)(res+Math.pow(arr[i], arr[i-1]));
			}
		}
		
		System.out.println("output : "+res);
		
		
		
	}

}
