//super class
class Sample
{
	final int v1=190;
	public void Display()
	{
		System.out.println("this is display() of sample class");
	}
}
//sub class
class Demo extends Sample
{
	double z1=9.113;
	public void view()
	{
		System.out.println("this is view() of demo class");
	}
}
//sub class
class Run extends Sample
{
	double z1=9.113;
	public void test()
	{
		System.out.println("this is view() of run class");
	}
}
class casting2
{
	public static void count(Sample arg1)//auto upcasting
	{
		System.out.println("arg1="+arg1);
	}
	public static Sample alpha()
	{
		Run d1=new Run();
		return d1;//auto upcastimg
	}
	public static void main(String[] args) 
	{
		System.out.println("program starts..........");
		Demo v1=new Demo();
		System.out.println("v1="+v1);
		Run v2=new Run();
		System.out.println("v2="+v2);
		Sample v3=new Sample();
		System.out.println("v3="+v3);
		count(v1);
		count(v2);
		count(v3);
		alpha();
		alpha();
		System.out.println("program ends.....");

	}
}