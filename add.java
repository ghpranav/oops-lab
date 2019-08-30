import java.util.Scanner;
class add {
	public static void main(String args[]) {
	
		int n1, n2, sum;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		n1 = sc.nextInt();
		
		System.out.print("Enter second number: ");
		n2 = sc.nextInt();
		
		sc.close();
		
		sum = n1 + n2;
		
		System.out.println("Sum = "+sum);
	}
}
