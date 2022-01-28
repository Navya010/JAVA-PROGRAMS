class Calculator
{
	public void Add(int a,int b)
	{
		System.out.println("Add="+(a+b));
	}
	public void Sub(int a,int b)
	{
		System.out.println("Sub="+(a-b));
	}
	public void Mul(int a,int b)
	{
		System.out.println("Mul="+(a*b));
	}
	public void Div(int a,int b)
	{
		System.out.println("Div="+(a/b));
	}
}
class SciCalculator extends Calculator
{
	public void Sin()
	{
		System.out.println("sin functiom member");
	}
	public void Cos()
	{
		System.out.println("Cos functiom member");
	}
	public void Tan()
	{
		System.out.println("sin functiom member");
	}
}
class ProgramCalculator extends Calculator
{
	public void AND(int a,int b)
	{
		int res=0;
		System.out.println("res="+(a&b));
	}
	public void OR(int a,int b)
	{
		int res=0;
		System.out.println("res="+(a&b));
	}
	public void XOR(int a,int b)
	{
		int res=0;
		System.out.println("res="+(a&b));
	}
}
class mainclass6
{
	public static void main(String[] args) 
	{
		System.out.println("progtam starts.....");
		Calculator c1=new Calculator();
		c1.Add(10,20);
		c1.Sub(10,20);
		c1.Mul(10,20);
		c1.Div(10,20);
		System.out.println("Calculator class is done.....");
		SciCalculator s1=new SciCalculator();
		s1.Sin();
		s1.Cos();
		s1.Tan();
		System.out.println("SciCalculator class is done");
		ProgramCalculator p1=new ProgramCalculator();
		p1.AND(10,30);
		p1.OR(10,10);
		p1.XOR(10,10);
		p1.Add(10,20);
		p1.Sub(10,20);
		p1.Mul(10,20);
		p1.Div(10,20);
		System.out.println("program Calculator class is done...");
		System.out.println("program ends..........");
	}	
}