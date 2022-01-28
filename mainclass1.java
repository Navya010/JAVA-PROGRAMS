class User
{
	int uid;
	String name;
	String email;
	String pwd;
	long mob;
	char gender;
	String dob;
	static String country="INDIA";
	public User(int uid,String name,String email,String pwd,long mob,char gender,String dob)
	{
		System.out.println("object of user1 class");
		this.uid=uid;
		this.name=name;
		this.email=email;
		this.pwd=pwd;
		this.mob=mob;
		this.gender=gender;
		this.dob=dob;
	}
	public User(int uid,String name,String email,String pwd,char gender,String dob)
	{
		System.out.println("object of user2 class");
		this.uid=uid;
		this.name=name;
		this.email=email;
		this.pwd=pwd;
		this.gender=gender;
		this.dob=dob;
	}
}
class UserService
{
	User usr;
	public void signup(String entName,String entEmail,String entPwd,long entMob,char entGender,String entDob)
	{
		System.out.println("received request for signup");
		usr=new User(100,entName, entEmail,entPwd,entMob,entGender,entDob);
		System.out.println("signup completed");
	}
	public void signup(String entName,String entEmail,String entPwd,char entGender,String entDob)
	{
		System.out.println("received request for signup");
		usr=new User(100,entName, entEmail,entPwd,entGender,entDob);
		System.out.println("signup completed");
	}
	public void showusercontact()
	{
		if(usr!=null)
		{
			System.out.println("user contact");
			System.out.println("mob:"+usr.mob);
			System.out.println("email:"+usr.email);
			System.out.println("user comtact");
		}
		else
		{
			System.out.println("signup first");
		}
	}
}
class mainclass1
{
	public static void main(String[] args)
	{
		System.out.println("program starts");
		UserService userserv=new UserService();
		userserv.signup("user1","user@gmail.com","123",793268268l,'m',"12-oct-2121");
		userserv.showusercontact();
		userserv.signup("user1","user@gmail.com","123",'m',"12-oct-2121");
		userserv.showusercontact();
		System.out.println("program ends");

	}
}
