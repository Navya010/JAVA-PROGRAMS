//Super Class
class Sample 
{
	public Sample()//Superclass-Constructor
	{
		//super();//create the object of superclass
		System.out.println("this is Sample() constructor");
	}
}
//SubClass
class Demo extends Sample
{
	public Demo()//Subclass-constructor
	{
		super();
		System.out.println("this is Demo() constructor");
	}
}
class mainclass7 
{
	public static void main(String[] args) 
	{
		System.out.println(" program starts.....");
        new Sample();
		new Demo();
		System.out.println("program ends......");
	}
}
