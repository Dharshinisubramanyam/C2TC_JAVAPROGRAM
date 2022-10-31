package Quizz;

public class QUIZZ7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	int a = args.length;
	int b = 10/a;
	System.out.println(a);
	try {
		if (a==1)
			a=a/a-a;
		if(a==2)
		{
			int []c= {1};
			c[8]=9;
		}
	}
	catch(ArrayIndexOutOfBoundException e)
	{
		System.out.println("typeA");
	}
	catch (ArithmeticException e)
}
{
	System.out.println("typeB";)
}
	}

}
}