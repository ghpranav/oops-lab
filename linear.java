import java.util.Scanner;
class linear {
	public static void main(String args[]) {
		int n, x, flag = 0;
		System.out.print("Enter the size of array: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		//int ar[n];
		int ar[] = new int[n];
		
		System.out.print("Enter the elements of array: ");
		for(int i=0; i<n; i++) {
			ar[i] = sc.nextInt();
		}
		
		System.out.print("Enter the search element: ");
		x = sc.nextInt();
		
		sc.close();
		
		for(int i=0; i<n; i++) {
			if( ar[i] == x) {
				flag = 1;
				break;
			}
		}
		
		if(flag == 1)
			System.out.println("Element found");
		else
			System.out.println("Element not found");
	}
}
