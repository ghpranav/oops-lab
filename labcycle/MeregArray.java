import java.util.Scanner;

class MergeArray {
	public static void main(String args[]) {
		int[] a, b, merged;
		int i=0, j=0, n=0, size;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input array A size:");
		size = sc.nextInt();
		a = new int[size];
		System.out.print("Enter elements: ");
		for(int ae : a)
			ae = sc.nextInt();

		System.out.print("Input array B size:");
		size = sc.nextInt();
		b = new int[size];
		System.out.print("Enter elements: ");
		for(int be : b)
			be = sc.nextInt();
		
		size = a.length + b.length;
		merged = new int[size];
		
		while(n != size-1) {	
			if(i == a.length - 1) {
				merged[n] = b[j];
				j++;
				n++;
			}
			else if(j == b.length - 1) {
				merged[n] = a[i];
				i++;
				n++;
			}
			else if(a[i] <= b[j]) {
				merged[n] = a[i];
				i++;
				n++;
			}
			else if(b[j] <= a[i]) {
				merged[n] = b[j];
				j++;
				n++;
			}
		}
		
		System.out.println("Sorted array:");
		for(int me : merged)
			System.out.println(me + " ");
	}
}
