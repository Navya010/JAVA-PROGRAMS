class prime
{
	public static void test(int n)
	{
		int j=0,i,m=0;
		m=n/2;
		if(n==0||n==1)
		{
			System.out.println(n + "is not a prime number");
		}
		else
		{
			for(i=2;i<=m;i++)
			{
				if(n%1==0)
				{
					System.out.println(n + "is not a prime number");
					j=1;
					break;
				}
			}
			if(j==0)
			{
				System.out.println(n + "is a prime number");
			}
		}	
	}
}	