class Sample
{
    String name="user";
	public void Display()
	{
		System.out.println("sample results");

	}

}
class Demo extends Sample
{
	int b=12;
	public void View()
	{
		System.out.println("Demo results");
	}

}
class Run extends Demo
{
	int a=10;
	public void Show()
	{
		System.out.println("Show..... run class");
	}
}
class mainclass4
{
	public static void main(String[] args) 
	{
		System.out.println("program starts........");
		Sample s1=new Sample();//create object of superclass
		s1.Display();//superclass FM
		System.out.println("name="+s1.name);//superclass of DM
		System.out.println("..----------------------");
		Demo d1=new Demo();//create object of subclass
		d1.View();
		System.out.println("b="+d1.b);
		Run r1=new Run();
		r1.Show();
		System.out.println("a="+r1.a);
		System.out.println("name="+d1.name);
		d1.View();
		System.out.println("b="+r1.b);
        r1.Show();
	    System.out.println("program ends..........");
    }
}