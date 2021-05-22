package transactions;
import java.util.Scanner;

 class LowBalanceException extends Exception {
	LowBalanceException(String name)
	{
	super(name);
	}
}
 class Account {
	int balance;
	
	Account(int balance){
		this.balance = balance;
	}
	void deposit(int amount) {
		
		System.out.println("Deposited "+amount);
		this.balance = this.balance + amount;
		System.out.println("Available Balance "+this.balance);
		
	}
	void withdraw(int amount)throws LowBalanceException
	{
		System.out.println("Trying to Withdraw "+amount);
		System.out.println("Available Balance "+ this.balance);
		if(amount<=this.balance)
		{
			
			System.out.println("Collect Cach "+amount);
			this.balance = this.balance-amount;
		}
		
		else
		{
			LowBalanceException err = new LowBalanceException("LowBalance");
			throw err;
		}
	}

}
public class Bank {
	public static void main(String args[]) {	
		Scanner scan = new Scanner(System.in);
		int amount;
		System.out.println("Enter intial amount");
		amount = scan.nextInt();
		Account obj = new Account(amount);
		System.out.println("Balance in Account "+ obj.balance);
		
		
		System.out.println("Enter Deposit amount");
		amount = scan.nextInt();
		obj.deposit(amount);
		
		
		System.out.println("Enter withdraw amount");
		amount = scan.nextInt();
		try
		{
			obj.withdraw(amount);
		}
		catch(LowBalanceException a)
		{
			System.out.println(" "+ a.getMessage());
		}
		System.out.println("Balance  in account "+ obj.balance);
	}


}
