import java.util.Scanner;

class Pyramid {
	public static void main(String args[]) {
		System.out.print("Enter base length of pyramid: ");
		int l = new Scanner(System.in).nextInt();
		for(int i=1; i<=l; i++) {
			for(int j=1; j<=i; j++)
				System.out.print("*");
			System.out.println("");
		}
		for(int i=l-1; i>=1; i--) {
			for(int j=i; j>=1; j--)
				System.out.print("*");
		System.out.println("");
		}
	}
}
