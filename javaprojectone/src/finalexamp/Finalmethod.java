package finalexamp;
class methodtest
{
	methodtest()
	{
		System.out.println("this is a default constructor");
	}
	final int a = 50;
	final void show()
	{
		System.out.println("value of a :"+a);
	}
}
public class Finalmethod extends methodtest {
void show()
{
	System.out.println("this is the final method of finalmethodex class");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Finalmethod fm = new Finalmethod();
fm.show();
	}

}
