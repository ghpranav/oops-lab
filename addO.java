import java.util.Scanner;
class addO {
	int n1, n2;
	
	void readInfo() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		n1 = sc.nextInt();
		
		System.out.print("Enter second number: ");
		n2 = sc.nextInt();
		
		sc.close();
	}

	void display() {
		System.out.println("Sum = "+(n1+n2));
	}

	public static void main(String args[]) {
		addO ob = new addO();
		
		ob.readInfo();
		ob.display();
	}
}

