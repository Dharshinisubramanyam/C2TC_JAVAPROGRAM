package exception;

public class FinallyblockEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a = 20, b=0;
try
{
	System.out.println("value of a:"+a);
	System.out.println("value of b:"+b);
	int div = a/b;
	System.out.println("division:"+div);
}
catch(NullPointerException npe)
{
	System.out.println(npe);
}
finally
{
	System.out.print("denominator cannot be zero");
}
System.out.println("hello java");
	}

}
