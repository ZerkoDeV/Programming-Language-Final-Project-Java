import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
	Scanner input = new Scanner(System.in); //inputs for the app
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00"); //format for the money 
	
	private int customerNumber; //the customer number
	private int pinNumber;	//pin number for each customer number
	private double checkingBalance = 0; //balance for checking balnce
	private double savingBalance = 0; //balance for saving balance
	
	
	//get and setters for everything	
	public int getCustomerNumber() {
		return customerNumber;
	}
	public int setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
		return customerNumber;
	}
	public int getPinNumber() {
		return pinNumber;
	}
	public int setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
		return pinNumber;
	}
	public double getCheckingBalance() {
		return checkingBalance;
	}
	
	public double getSavingBalance() {
		return savingBalance;
	}
	
	//calculate checking account withdrawal
	public double calcCheckingWithdrawal(double amount) {//substracting up the previous amount of money that has been withdrawed from the checking account
		checkingBalance = (checkingBalance - amount);
		return checkingBalance;
	}
	//calculate saving account withdrawal
	public double calcSavingWithdrawal(double amount) {//substracting up the previous amount of money that has been withdrawed from the saving account
		savingBalance = (savingBalance - amount);
		return savingBalance;
		
	}
	//calculate checking account deposit
	public double calcCheckingDeposit(double amount) {//adding up the previous amount of money that has been inputted inside the checking account
		checkingBalance = (checkingBalance + amount);
		return checkingBalance;
	}
	//calculate saving account deposit
	public double calcSavingDeposit(double amount) {
		savingBalance = (savingBalance + amount); //adding up the previous amount of money that has been inputted inside the saving account
		return savingBalance;
	}
	//customer checking account withdraw input
	public void getCheckingWithdrawalInput() {
		System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
		System.out.print("Amount you want to withdraw: ");
		double amount = input.nextDouble();
		
		if((checkingBalance - amount) >= 0) {
			 calcCheckingWithdrawal(amount);
			 System.out.println("New Account Balance: " + moneyFormat.format(checkingBalance));
			 
		}else {
			System.out.println("Balance cannot be less than 0." + "\n"); //balance cannot be less than 0
		}
	}
	//customer saving account withdraw input
	public void getSavingWithdrawalInput() {
		System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
		System.out.print("Amount you want to withdraw from saving account: ");
		double amount = input.nextDouble();
		
		if((savingBalance - amount) >= 0) {
			 calcCheckingWithdrawal(amount);
			 System.out.println("New Saving Account Balance: " + moneyFormat.format(savingBalance));
			 
		}else {
			System.out.println("Balance cannot be less than 0." + "\n");
		}
	}
	//customer checking account deposit input
	public void getCheckingDepositInput() {
		System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
		System.out.print("Amount you want to deposit: ");
		double amount = input.nextDouble();
		
		if((checkingBalance + amount) >= 0) {
			 calcCheckingDeposit(amount);
			 System.out.println("New Account Balance: " + moneyFormat.format(checkingBalance));
			 
		}else {
			System.out.println("Balance cannot be less than 0." + "\n");
		
		
		}
	
	
	}
	//customer saving account deposit input
	public void getSavingDepositInput() {
		System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
		System.out.print("Amount you want to deposit: ");
		double amount = input.nextDouble();
		
		if((checkingBalance + amount) >= 0) {
			 calcCheckingDeposit(amount);
			 System.out.println("New Saving Account Balance: " + moneyFormat.format(savingBalance));
			 
		}else {
			System.out.println("Balance cannot be less than 0." + "\n");
		
		
		}
	}
}