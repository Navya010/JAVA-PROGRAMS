interface Run
{
	public void Show();
}
interface Run2
{
	public void View();
}
class Run1
{
	public void count()
	{
		System.out.println();
	}

}
class Sample extends Run1 implements Run,Run2
{
	@Override
	public void Show()
	{
		System.out.println("show function private");
	}
	@Override
	public void View()
	{
		System.out.println("View function private");
	}
}
class Mainclass10
{
	public static void main(String[] args) {
		Sample s1= new Sample();
		s1.Show();
		s1.View();
		s1.count();
	}
}