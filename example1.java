class example1
{
	public static boolean test(int a, int b, int c)
	{
		if(a>b&&b>=c)
		{
			return true;
		}
		else if((a==b&&b>c)||(a>b&&b==c))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("program starts....");
		test(2,5,11);
		test(5,5,7);
		System.out.println("program ends.........");
	}

}