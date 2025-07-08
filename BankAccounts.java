class BankAccounts{

    static String ifscCode;
    static double balance;
	
	public static void credit(double amount){
	
		System.out.println("Credit started");
		
		boolean amountcheck = amount > balance;		
		if(amountcheck) {
		
		balance = balance + amount;
		
		} else {
			
			System.out.println("Ammount must be greater than 0");
		}
		System.out.println("Credit Ended");
		
	}
	
	public static void debit(double amount){
		
		System.out.println("Debit Started");
		boolean amountcheck= amount<= balance;
		
		if (amountcheck){
		
		balance = 200.00 - 100.00;
		} else{
			System.out.println("Insufficient balance");
			
		}
		System.out.println("Debit Ended");
		
	}
	
}





		
		