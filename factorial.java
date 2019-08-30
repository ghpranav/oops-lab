import java.util.Scanner;
class factorial {
	public static void main(String args[]) {
	
		int num, i = 1;
		
		System.out.print("Enter the number: ");
		/*Scanner sc = new Scanner(System.in);
		//num = sc.nextInt();
		sc.close();*/
		num = new Scanner(System.in).nextInt();
		long fact = 1;
		
		while(i<=num) {
			fact = fact * i;
			i++;
		}
		
		System.out.println("Factorial of "+num+" = "+fact);
	}
}
