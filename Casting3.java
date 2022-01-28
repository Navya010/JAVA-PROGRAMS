interface Run
{
    public double findAvg(int n1,int n2,int n3);
    public void test(int num);
}
class Demo implements Run
{
    @Override
    public void test(int num)//Auto-Widening
    {
        System.out.println("Input : "+num);
    }
    @Override
    public double findAvg(int n1,int n2,int n3)
    {
      int sum = n1 + n2 + n3;
      int avg = sum/3;
      return avg;//Auto-Widening
    }
}
class Casting3
{
    public static void main(String[] args)
    {
        System.out.println("Program starts...");
        Demo d1 = new Demo();
        byte  v1 = 29;
        short v2 = 81;
        int   v3 = 2;
        d1.test(v1);
        d1.test(v2);
        d1.test(v3);
        double avg = d1.findAvg(3,4,9);
        System.out.println("avg : "+avg);
        System.out.println("program emds.....");
    }
}



   