import java.util.Scanner;
class oddevenC {
	static void check(int n) {
		if(n % 2 == 0)
			System.out.println("Even");
		else
			System.out.println("Odd");
	}

	public static void main(String args[]) {
		int n;
		
		n = Integer.parseInt(args[0]);
		
		check(n);
	}
}
