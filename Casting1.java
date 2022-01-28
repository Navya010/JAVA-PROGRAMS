interface Runnable
{
	public int add(double d1,double d2);
}
class Sample implements Runnable
{
	@Override
	public int add(double d1,double d2)
	{
		double d3=d1+d2;
		int res=(int)d3;
		return res;

	}
}
class Casting1
{
	public static void main(String[] args) 
	{
		System.out.println("program starts.....");
		System.out.println("program ends........");
	
    }
}