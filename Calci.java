Interface Calci
{
 public int getSum(int a,int b);
 public int getDiff(int a,int b);
}
public class CalciImple implements Calci
{
  public int getSum(int a,int b)
	{
	  return a+b;
	}
	public int getDiff(int a,int b)
	{
	  return a-b;
	}
}
class CalsiDriver
{
	public static void main(String[] args)
	{
       Scanner sc=new Scanner(System.in);
	   CalsiImple c=new CalciImple();
	   System.out.println("Enter 1st number");
	   int n1=sc.nextInt();
       System.out.println("Enter 2nd number");
	    int n2=sc.nextInt();
		System.out.println(n1+"+"n2+c.findsum(n1,n2));
        System.out.println(n1-"+"n2+c.findDiff(n1,n2));
	}
}