import java.util.Scanner;

class quadratic {
	public static void main(String args[]) {
		int a, b, c;
		double det, r1, r2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of A: ");
		a = sc.nextInt();
		System.out.print("Enter the value of B: ");
		b = sc.nextInt();
		System.out.print("Enter the value of C: ");
		c = sc.nextInt();
		det = (b*b)-(4*a*c);
		if(det == 0.0) {
			r1 = r2 = (-b+Math.sqrt(det))/(2*a);
			System.out.println("Roots are equal");
			System.out.println("r1 = r2 = "+r1);
		}
		else if(det > 0) {
			r1 = (-b+Math.sqrt(det))/(2*a);
			r2 = (-b-Math.sqrt(det))/(2*a);
			System.out.println("Roots are distinctive");
			System.out.println("r1 = "+r1);
			System.out.println("r2 = "+r2);
		}
		else {
			System.out.println("Roots are imaginary");
		}
	}
}
