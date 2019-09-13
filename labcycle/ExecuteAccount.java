import java.util.Scanner;

class Customer {
	String cust_name;
	int acc_no;
	String acc_type;
	double balance;
	Scanner sc = new Scanner(System.in);
	
	Customer(String cust_name, int acc_no, String acc_type, double balance) {
		this.cust_name = cust_name;
		this.acc_no = acc_no;
		this.acc_type = acc_type;
		this.balance = balance;
	}
	
	Customer() {
		cust_name = "";
		acc_no = 0;
		acc_type = "";
		balance = 0;
	}
	
	void getData() {
		System.out.print("\nEnter customer name: ");
		cust_name = sc.nextLine();
		
		System.out.print("Enter account type: ");
		acc_type = sc.nextLine();
		
		System.out.print("Enter account number: ");
		acc_no = sc.nextInt();
	}
	
	void display() {
		System.out.println("\nCustomer name: " + cust_name);
		System.out.println("Account number: " + acc_no);
		System.out.println("Account type: " + acc_type);
		System.out.println("Account balance: " + balance);
	}
	
	void deposit() {
		System.out.print("\nEnter the amount to be deposited:");
		double credit = sc.nextDouble();
		balance += credit;
		System.out.println("Remaining balance: " + balance);
	}
	
	void withdraw() {
		System.out.print("\nEnter the amount to be withdrawn:");
		double debit = sc.nextDouble();
		if(debit <= balance) {
			balance -= debit;
			System.out.println("Remaining balance: " + balance);
		}
		else
			System.out.println("Insuffecient balance");
	}
}

class ExecuteAccount {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Customer[] cust = new Customer[5];
		int i, acc, flag;
		
		System.out.println("Enter initial details of 5 accounts:-");
		for(i=0; i<5; i++) {
			cust[i] = new Customer();
			cust[i].getData();
		}
		
		while(true) {
			flag = 0;
			System.out.print("\nEnter your account number (-1 to exit): ");
			acc = sc.nextInt();
			
			if(acc == -1)
				System.exit(0);
			for(i=0; i<5; i++)
				if(acc == cust[i].acc_no) {
					menu(cust[i]);
					flag = 1;
					break;
				}
				
			if(flag == 0)
				System.out.println("Account not found!");
		}
	}
	
	static void menu(Customer cust) {
		Scanner sc = new Scanner(System.in);
		loop:
		while(true) {
			System.out.print("\n1. Display\n2. Deposit\n3. Withdraw\n4. Exit\nEnter Option:");
				int option = sc.nextInt();
				switch(option){
					case 1:{
						cust.display();
						break;
					}
					case 2:{
						cust.deposit();
						break;
					}
					case 3:{
						cust.withdraw();
						break;
					}
					case 4:{
						break loop;
					}
					default:{
						System.out.println("Invalid Choice");
					}
				}
		}
	}
}
