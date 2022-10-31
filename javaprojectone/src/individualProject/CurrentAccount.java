package individualProject;



public abstract class CurrentAccount extends BankAccount{
	public CurrentAccount(int accNo, String accName, float accBal) {
		super(accNo, accName, accBal);
		// TODO Auto-generated constructor stub
	}
	private final float creditLimit = 0;
 
	public abstract float withdraw();
	public abstract String toString();
}

