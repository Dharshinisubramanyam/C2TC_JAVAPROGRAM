package staticthing;

public class Staticblock {
	{
		System.out.println("instance block-1");
	}
	{
		System.out.println("instance block-2");
	}
	static
	{
		System.out.println("static block-1");
	}
	static
	{
		System.out.println("static block-2");
	}
	Staticblock()
	{
		System.out.println("0 arg constructor");
	}
	Staticblock(int a)
	{
		System.out.println("1-arg constructor");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Staticblock();
new Staticblock(20);
	}

}
