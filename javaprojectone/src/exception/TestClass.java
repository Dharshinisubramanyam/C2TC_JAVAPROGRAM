package exception;

import java.util.Scanner;
public class TestClass
{
	
private static int age;
static void validate() throws InvalidAgeException
{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter your age");
	age = sc.nextInt();
	if(age<18)
	
		throw new InvalidAgeException("invalid age, you are not eligible to vote");

	else
		System.out.println("welcome to vote");
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	validate();
}
catch(Exception e)
{
	System.out.println("caught an Exception:\n"+e);
}
	}

}
