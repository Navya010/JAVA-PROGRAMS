interface Run
{
	public void Show();
}
interface Run1 extends Run
{
	public void View();
}
class Sample implements Run1
{
	public void Show()
	{
		System.out.println("show function private");
	}
	public void View()
	{
		System.out.println("View function private");
	}
}
class Mainclass9
{
	public static void main(String[] args) {
		Sample s1= new Sample();
		s1.Show();
		s1.View();
	}
}