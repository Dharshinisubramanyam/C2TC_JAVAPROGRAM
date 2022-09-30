package exception;

public class TrycatchEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("11");
System.out.println("before divide");
try {
	int x = 1/0;
	System.out.println("after divide");
}
catch(ArithmeticException ae)
{
	System.out.println("a number cannot be divided by zero");
}
System.out.println("22");
	}

}
