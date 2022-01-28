interface Service
{
	public void login(String uname,int password);
	public void details();
	public void logout();
}
class UserService implements Service
{
	String uname;
	String password;
	@Override
	public void login(String uname,int password)
	{
		System.out.println("this is the login() of userservice class");
		this.uname=uname;
		this.password=password;
		System.out.println(uname);
		System.out.println(password);
	}
	@Override
	public void details()
	{
		System.out.println("this is the details() of the uswrservice class");
	}
	@Override
	public void logout()
	{
		System.out.println("this is the logout() of userservice class");
	}
}
class ProductService implements Service
{
	String uname;
	@Override
	public void login(String uname,int password)
	{
		System.out.println("this is the login() of productservice");
	}
	@Override
	public void details()
	{
		System.out.println("this is the details() of productservice class");
		/*this.name=name;
		this.qty=qty;
		this.cost=cost;
		System.out.println(name);
		System.out.println(qty);
		System.out.println(cost);*/
	}
	@Override
	public void logout()
	{
		System.out.println("this is the logout() of productservice class");
	}

}
class ServiceManager
{
	public static Service getDao(String sname)
	{
		if(sname.equalsIgnoreCase("userService"))
		{
			Service ref;
			ref=new UserService();
			return ref;
		}
		else
		{
			Service ref;
			ref=new ProductService();
			return ref;
		}
	}
}
class UserClient
{
	public void signup(String uname,int password)
	{
		Service dao=ServiceManager.getDao("UserService");
		dao.login(uname,password);
		dao.details();
		dao.logout();
	}

}
class abstraction
{
	public static void main(String[] args)
	{
	 	System.out.println("program starts....");
	 	String uname="Nandu";
	 	int password="123";
	 	/*String name="Mobile";
	 	int cost=1200;*/
	 	UserClient uc=new UserClient();
	 	uc.signup();
	    System.out.println("program ends......");
    }
}
