import java.util.Scanner;
class prime {
	public static void main(String args[]) {
		int n, flag = 0;
		
		System.out.print("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(int i = 2; i <= n/2; i++)
			if(n%i == 0) {
				flag = 1;
				break;
			}
		
		if(flag == 1)
			System.out.println("Not Prime");
		else
			System.out.println("Prime");
	}
}
