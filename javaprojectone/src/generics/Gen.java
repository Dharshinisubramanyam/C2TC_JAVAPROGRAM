package generics;

public class Gen <T>
{
	T ob;
	Gen (T o)

	{
		ob = o;
	}
		public T getob()
		{
			return ob;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Gen <Integer> iob = new Gen <>(100);
int x=iob.getob();
System.out.println(x);
Gen<String> sob = new Gen <>("hello");
String str = sob.getob();
System.out.println(str);
	}

}
