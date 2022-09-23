package interfaceprog;

public class Amazon_nonprime implements Amazon {
	public void delivery_charges()
	{
		System.out.println("delivery charges for non primeaccount holders= 100Rs");
	}

	public static void main(String[] args)
	{
		  Amazon_prime  ob=new  Amazon_prime ();
		ob.delivery_charges();
		
		Amazon_nonprime ob1=new Amazon_nonprime();
		ob1.delivery_charges();
		
		 Amazon_prime ob2= new  Amazon_prime ();
		ob2.delivery_charges();
	

	}

}
