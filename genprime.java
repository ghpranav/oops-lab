import java.util.Scanner;
class genprime {
	public static void main(String args[]) {
		int n, i, num = 1, flag, count = 0;
		
		System.out.print("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		while(count != n) {
			flag = 0;
			for(i = 2; i <= num/2; i++)
				if(num%i == 0) {
					flag = 1;
					break;
				}
			if(flag == 0) {
					System.out.println(num);
					count++;
			}
			num++;
		}	
	}
}
