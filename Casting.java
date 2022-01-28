class Casting
{
	public static void main(String[] args) 
	{
		System.out.println("program starts.......");
		int i1=20;
		double d1=i1;//Widening type casting
		System.out.println("i1="+i1);
		System.out.println("d1="+d1);
		double d2=2.34;
		int i2=(int)d2;//Narrowing (int) is type casting
		System.out.println("d2="+d2);
		System.out.println("i2="+i2);
		System.out.println("program ends.......");
		
	}
}