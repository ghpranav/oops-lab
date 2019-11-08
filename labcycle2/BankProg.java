import java.util.Scanner;

abstract class Bank {
	String bank_type;
	boolean OfferCreditCard;
	int term;
	float roi, amt, balance;
	Scanner sc = new Scanner(System.in);
	
	Bank() {
		amt = 0;
		balance = 0;
		term = 0;
		roi = 0;
		System.out.print("Enter the bank type (National/International): ");
		bank_type = sc.nextLine();
	}
	
	boolean isInternational() {
		if(bank_type.equalsIgnoreCase("international"))
			return true;
		return false;
	}
	
	abstract void getRoi();
	
	void deposit() {
		System.out.print("Enter the amount to be deposited: ");
		amt = sc.nextFloat();
		balance += amt;
		System.out.print("Enter the deposition term: ");
		term = sc.nextInt();
	}
	
	void setCC() {
		if(isInternational())
			OfferCreditCard = true;
		else
			OfferCreditCard = false;
	}
}

class SBI extends Bank {
	SBI() {
		super();
		setCC();
	}
	
	void getRoi() {
		if(term >= 3)
			if(isInternational())
				roi = 8f;
			else
				roi = 7f;
	}
}

class PNB extends Bank {
	PNB() {
		super();
		setCC();
	}
	
	
	void getRoi() {
		if(term >= 3)
			if(isInternational())
				roi = 8f;
			else
				roi = 7f;
	}
}

class ICICI extends Bank {
	ICICI() {
		super();
		setCC();
	}
	
	
	void getRoi() {
		if(term >= 3)
			if(isInternational())
				roi = 8f;
			else
				roi = 7f;
	}
}

class SPI extends Bank {
	SPI() {
		super();
		setCC();
	}
	
	
	void getRoi() {
		if(term >= 3)
			if(isInternational())
				roi = 8f;
			else
				roi = 7f;
	}
}

class BankProg {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Bank ref;
		int count, i;
		
		System.out.print("\nEnter number of SBI Accounts: ");
		count = sc.nextInt();
		SBI sbi[] = new SBI[count];
		for(i=0; i<count; i++) {
			System.out.println("Account " + (i+1) + " : ");
			sbi[i] = new SBI();
			ref = sbi[i];
			ref.deposit();
		}
		
		System.out.print("\nEnter number of PNB Accounts: ");
		count = sc.nextInt();
		PNB pnb[] = new PNB[count];
		for(i=0; i<count; i++) {
			System.out.println("Account " + (i+1) + " : ");
			pnb[i] = new PNB();
			ref = pnb[i];
			ref.deposit();
		}
		
		System.out.print("\nEnter number of ICICI Accounts: ");
		count = sc.nextInt();
		ICICI icici[] = new ICICI[count];
		for(i=0; i<count; i++) {
			System.out.println("Account " + (i+1) + " : ");
			icici[i] = new ICICI();
			ref = icici[i];
			ref.deposit();
		}
		
		System.out.print("\nEnter number of SBI Accounts: ");
		count = sc.nextInt();
		SPI spi[] = new SPI[count];
		for(i=0; i<count; i++) {
			System.out.println("Account " + (i+1) + " : ");
			spi[i] = new SPI();
			ref = spi[i];
			ref.deposit();
		}
	}
}
