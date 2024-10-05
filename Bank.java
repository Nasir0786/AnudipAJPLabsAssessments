package Anudip_Lab_1;

public class Bank {
	
	private double amount;
	
	//creating parametrized constructor	
	public Bank(double amount) 
	{
		this.amount = amount;
	}
	
	// method to withdraw the money
	public void withdraw(double withdrawalAmount)
	{
		String result = (withdrawalAmount <= amount) ? "Withdraw Successfull" : "Insufficicent Balance";
		
		if (withdrawalAmount <= amount)
		{
			amount = amount - withdrawalAmount;
		}
		//result printing
			System.out.println(result);
	}
	
	public void deposit(double depositAmount) {
        amount = amount + depositAmount; 
        System.out.println("Deposit successful");
    }
		//displaying the balance
	public void displayBalance() {
        System.out.println("Total Balance: " + amount);
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating instance of bank class
		Bank account = new Bank(10000);
		
		account.withdraw(3000);
		account.deposit(5000);
		account.displayBalance();
	}

}



