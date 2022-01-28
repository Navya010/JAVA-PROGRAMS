class Maxtripple
{
	public static int maxTriple(int[] nums) 
	{
		int result = 0;
        int a = nums[0];
        int b= nums[((nums.length+1)/2) -1];
        int c = nums[nums.length -1];
        if (a>b && a>c)
        {
        	result = a;
        }
        else if (b>a && b>c)
        {
            result = b;
        }
        else if (c>a && c>b)
        {
            result = c;
        }
        else
        {
           result =1;
        }
   }
}
public static void main(String[] args) 
{
	int[] nums=(1,2,3);
	int res;
	res=maxtripple(nums)
	System.out.println(res);
}