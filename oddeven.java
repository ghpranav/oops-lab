import java.util.Scanner;
class oddeven {
	public static void main(String args[]) {
		int n;
		
		System.out.print("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		if(n % 2 == 0)
			System.out.println("Even");
		else
			System.out.println("Odd");
	}
}
