package exception;

public class TrycatchEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("111");
try
{
	int x = 12/0;
	System.out.println("result of x:"+x);
	System.out.println("333");
}
catch(ArithmeticException ae)
{
	System.out.println("hello World");
}
System.out.println("444");
	}

}
