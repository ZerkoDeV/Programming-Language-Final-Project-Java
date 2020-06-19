
import java.io.IOException;//This import is used for when there is any input / output file operation issues while application performing certain tasks accessing the files. 
import java.text.DecimalFormat;
import java.util.HashMap;//imports a hashmap that stores key and value pair
import java.util.Map.Entry;//import for the data entry when the atm launches
import java.util.Scanner;

public class OptionMenu extends Account{
	Scanner menuInput = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00"); // money format for the ATM
	
	HashMap<Integer, Integer> data = new HashMap<Integer, Integer>(); //to store key and value pair, for the data inside the atm
	
	
	
	public void getLogin() throws IOException{
		int x = 1;
	
		
		do {
			try {
				data.put(12345678,1234);//a certain set of data that i have set up, so if the user inputs a diff number of id and pin, the ATM will give u a caption "wrong pin / customer number"
				data.put(898989, 1212);
				
				System.out.println("Welcome to the ATM!");//title when the atm starts
				
				
				System.out.print("Enter Your Customer Number: "); //user is asked to input customer number
				setCustomerNumber(menuInput.nextInt());
				
				System.out.print("Enter Your Pin Number: ");//user is asked to input pin number
				setPinNumber(menuInput.nextInt());
			}catch (Exception e) {
				System.out.println("\n" + "Invalid character(s). Only numbers." + "\n");
				x = 2;
				
			}
			for(Entry<Integer, Integer> entry : data.entrySet()) {
				if(entry.getKey() == getCustomerNumber() && entry.getValue() == getPinNumber()) {
					getAccountType();
				}
			}
			System.out.println("\n" + "Wrong Customer Number or Pin Number." + "\n");
		}while(x == 1);
	}
	public void getAccountType() {
		System.out.println("Select the Account you want to access: ");
		System.out.println("Type 1 - Checking Account");
		System.out.println("Type 2 - Saving Account");
		System.out.println("Type 3 - Exit");
		System.out.print("Choice: ");
		
		selection = menuInput.nextInt();
		
		switch(selection) {//cases to 4 options in the get account type
		case 1:
			getChecking();
			break;
		case 2:
			getSaving();
			break;
			
		case 3:
			System.out.println("Thank You for using this ATM, bye.");
			break;
		default:
			System.out.println("\n" + "Invalid Choice." + "\n");
			getAccountType();
			
		
		}
	}
	public void getChecking() {
		System.out.println("Checking Account: ");
		System.out.println("Type 1 - View Balance");
		System.out.println("Type 2 - Withdraw Funds");
		System.out.println("Type 3 - Deposit Funds");
		System.out.println("Type 4 - Exit");
		System.out.print("Choice: ");
		
		selection = menuInput.nextInt();
		
		switch(selection) {
		case 1:
			System.out.println("Checking Account Balance: " + moneyFormat.format(getCheckingBalance()));
			getAccountType();
			break;
		case 2:
			getCheckingWithdrawalInput();
			getAccountType();
			break;
			
		case 3:
			getCheckingDepositInput();
			getAccountType();
			break;
		case 4:
			System.out.println("Thank You for using this ATM, bye.");
			break;
		default:
			System.out.println("\n" + "Invalid Choice." + "\n");
			getChecking();
			
		
		}
	}
	public void getSaving() {
		System.out.println("Saving Account: ");
		System.out.println("Type 1 - View Balance");
		System.out.println("Type 2 - Withdraw Funds");
		System.out.println("Type 3 - Deposit Funds");
		System.out.println("Type 4 - Exit");
		System.out.print("Choice: ");
		
		selection = menuInput.nextInt();
		
		switch(selection) {
		case 1:
			System.out.println("Saving Account Balance: " + moneyFormat.format(getSavingBalance()));
			getAccountType();
			break;
		case 2:
			getSavingWithdrawalInput();
			getAccountType();
			break;
			
		case 3:
			getSavingDepositInput();
			getAccountType();
			break;
		case 4:
			System.out.println("Thank You for using this ATM, bye.");
			break;
		default:
			System.out.println("\n" + "Invalid Choice." + "\n");
			getChecking();
			
		
		}
	}
	int selection;
	
	
	
	
	
}
