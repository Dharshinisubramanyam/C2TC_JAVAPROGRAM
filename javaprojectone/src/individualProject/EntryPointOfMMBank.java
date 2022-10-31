package individualProject;

public class EntryPointOfMMBank 




{
	public static void main(String[] args) {
		MMFactory bankfactory=new MMFactory();
		 MMBankSavingsAccount SavingAcc=new  MMBankSavingsAccount(0, null, 0, false);
		 MMBankurrentAccount CurrentAcc=new  MMBankurrentAccount(0, null, 0, 0);
		 SavingAcc.withdraw();
		 SavingAcc.toString();
		 CurrentAcc.withdraw();
		 CurrentAcc.toString();
	}

}
 