package javaprojectone;
class withdraw
{
	int amt_withdraw=2000;
	
}

public class Inheritance extends withdraw {
int amt_left=5000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Inheritance ob1= new  Inheritance();
		 System.out.println("amountwithdraw"+ ob1.amt_withdraw);
	}

}
