import java.util.Scanner;

class Cube {
	int a;
	Scanner sc = new Scanner(System.in);
	
	void readInfo() {
		System.out.println("Enter side:");
		a = sc.nextInt();
	}
	
	int volumeProvider() {
		return(a*a*a);
	}
	
	int areaProvider() {
		return(6*a*a);
	}
}

class CubeVol {
	public static void main(String args[]) {
		Cube cubes[] = new Cube[3];
		
		for(int i=0; i<3; i++) {
			System.out.println("\nCube " + (i+1) + ":");
			cubes[i] = new Cube();
			cubes[i].readInfo();
			System.out.println("Volume of cube " + (i+1) + " = " + cubes[i].volumeProvider() );
			System.out.println("Outer area of cube " + (i+1) + " = " + cubes[i].areaProvider() );
		}
	}
}
