class BankAccountRunner{

	
	public static void main(String[] accounts){
	
	
		System.out.println("Main Started");
		BankAccounts.ifscCode="cnr457";
	
		BankAccounts.credit(200.0);
		System.out.println(" Ifsc code : " + BankAccounts.ifscCode);
		
		
		System.out.println("The current balance is : Rs " + BankAccounts.balance);
		
		BankAccounts.debit(100.0);

		
		System.out.println("The current balance is : Rs " + BankAccounts.balance);
		
	
		System.out.println("Main Ended");


	}


}