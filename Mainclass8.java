interface Run
{
	public void test();
}
interface Run1 extends Run
{
	public void count();
}
class Sample implements Run1
{
	public void test()
	{
		System.out.println("tets() overriden");
	}
	public void count()
	{
		System.out.println("count() overriden");
	}
}
class Mainclass8
{
	public static void main(String[] args) {
		Sample s1=new Sample();
		s1.test();
		s1.count();
	}
}