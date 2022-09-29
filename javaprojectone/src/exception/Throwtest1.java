package exception;

public class Throwtest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	ArithmeticException a = new ArithmeticException("hello from throw");
	throw a;
}
catch(ArithmeticException ae) {
	System.out.println("ArithmeticException caught:\n"+ae);
	System.out.println(ae.getMessage());
}
	}

}
  