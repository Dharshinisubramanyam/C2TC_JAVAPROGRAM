package exception;

public class FinallyblockExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a = 20, b= 30;
try
{
	int sum= a+b;
	System.out.println("sum:"+sum);
}
catch(Exception e)
{
	System.out.println(e);
}
finally
{
	System.out.println("finally block must be executed");
}
System.out.println("hello java");
	}

}
