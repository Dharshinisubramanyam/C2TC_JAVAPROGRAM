 package staticthing;

public class Staticmethod {
static int x = 20;
int y = 30;
void display()
{
	System.out.println(x);
	System.out.println(y);
}
static void show()
{
	System.out.println(x);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Staticmethod st = new Staticmethod();
st.display();
Staticmethod.show();
	}

}
