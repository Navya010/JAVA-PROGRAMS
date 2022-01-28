abstract class Sample
{
	int v1=10;
	abstract public void Display();
	public void View()
	{
		System.out.println("this is Display() of sample class");
	}
}
abstract class Demo extends Sample
{
	
	int v2=20;
	abstract public void Dispaly();
	public void View()
	{
		System.out.println("this is View() of demo class");
	}
}
class Run 
{
	public void View()
	{
		System.out.println("this is Show() of run class");
	}
}
class mainclass
{
	public static void main(String[] args) 
	{
		System.out.println("program starts......");
		/*Sample s1;
		Demo d1;*/
		Run r1=new Run();
		r1.View();
		System.out.println("program ends........");
	}
}