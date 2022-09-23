package finalexamp;

public class Finalvar {
 int a = 20;
void change()
{
	 a = 40;
	System.out.println(a);
	final int i = 0;
	for (i = 0; i<5; i++)
	{ 
		System.out.println("value of :"+i);
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Finalvar fv = new Finalvar();
fv.change();
	}

}
