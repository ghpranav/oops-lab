import java.util.Scanner;

class sqrt {
	public static void main(String args[]) {
		int n;
		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		System.out.println("Square root of "+n+" = "+Math.sqrt(n));
	}
}
