//classname bank.java
import java.util.Scanner;
class Account{
	Scanner sc = new Scanner(System.in);
	String	CustomerName;
	String AccountType;
	int AccountNumber;
	double AccountBalance;
	
	Account(){
		AccountBalance = 0;
	}
	void GetAccountData(){
		System.out.println("Enter Customer Name:");
		CustomerName = sc.nextLine();
		System.out.println("Enter Account Type:");
		AccountType = sc.nextLine();
		System.out.println("Enter Account Number:");
		AccountNumber = sc.nextInt();
		System.out.println("Current Balance:" + AccountBalance);		
	}
	void DisplayAccountData(){
		System.out.println("Customer Name:" + CustomerName);
		System.out.println("Account Type:" + AccountType);		
		System.out.println("Account Number:" + AccountNumber);		
		System.out.println("Current Balance:" + AccountBalance);		
	}
	void WithdrawAmount(){
		System.out.println("Enter amount to be withdrawn:");
		int WithdrawAmount = sc.nextInt();
		if(WithdrawAmount > AccountBalance){
			System.out.println("Insufficient Balance");
		}
		else{
			System.out.println("Amount withdrawn: " + WithdrawAmount);
			AccountBalance = AccountBalance - WithdrawAmount;
		}
		System.out.println("Current Balance:" + AccountBalance);
	}
	void DepositAmount(){
		System.out.println("Enter amount to be deposited:");
		int DepositAmount = sc.nextInt();
		System.out.println("Amount to be deposited: " + DepositAmount);
		AccountBalance = AccountBalance + DepositAmount;
		System.out.println("Current Balance:" + AccountBalance);
	}
}

class ExecuteAccount{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Account[] object = new Account[2];
		for(int i = 0; i<2; i++){
			object[i] = new Account();
			object[i].GetAccountData();
		}
		int j =1;
		while(j == 1){
			System.out.println("1. Operations\n2. exit");
			int opt = sc.nextInt();
			switch(opt){
				case 1:{
					System.out.println("Enter Account Number:");
					int AccountNumber = sc.nextInt();
					for(int i = 0; i<5; i++){
						if(object[i].AccountNumber == AccountNumber){
							System.out.println("1. Display\n2. Deposit\n3. Withdraw\nEnter Option:");
							int option = sc.nextInt();
							switch(option){
								case 1:{
									object[i].DisplayAccountData();
									break;
								}
								case 2:{
									object[i].DepositAmount();
									break;
								}
								case 3:{
									object[i].WithdrawAmount();
									break;
								}
								default:{
									System.out.println("Invalid Choice");
								}
							}
							break;
					
					 	}
					 	else{
					 		System.out.println("Invalid Account Number");
					 	}
					}
					break;
				}
				case 2:{
					System.exit(0);
				}
				default:{
					System.out.println("Invalid Choice");
				}
			}
		}
		
	}
}
