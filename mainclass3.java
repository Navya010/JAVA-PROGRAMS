class Sample
{
    String name="user";
	public void Display()
	{
		System.out.println("sample");

	}

}
class Demo extends Sample
{
	int b=12;
	public void View()
	{
		System.out.println("Demo");
	}

}
class mainclass3
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
		System.out.println("name="+d1.name);
         d1.Display();
	    System.out.println("program ends..........");
    }
}