package assignment3;

public class Code18_forloop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number = 8;
int i;
boolean isprime= true;
for(i=2; i<number/2; i++);
{
	if (number%i==0)
	{
		isprime=false;
	}
	if(isprime==true)
	{
		  System.out.println("the number is a prime number");
	}
	else
	{
		  System.out.println("the number is not a prime number");
	}
		  
}
	}

}
