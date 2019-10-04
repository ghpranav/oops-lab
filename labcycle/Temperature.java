import java.util.Scanner;

class Record {
	int[][] citydata = new int[6][5];
	Scanner sc = new Scanner(System.in);
	
	Record() {
		for(int i=0; i<6; i++)
			for(int j=0; j<5; j++)
				citydata[i][j] = 0;
	}
	
	void getData() {
		for(int i=0; i<6; i++) {
			System.out.print("Day " + (i+1) + ": ");
			for(int j=0; j<5; j++)
				citydata[i][j] = sc.nextInt();
		}
	}
	
	void maxTemp() {
		int max = citydata[0][0], m = 1, n  = 1;
		for(int i=0; i<6; i++)
			for(int j=0; j<5; j++)
				if(max < citydata[i][j]) {
					max = citydata[i][j];
					m = j+1;
					n = i+1;
				}
		System.out.println("Max temperature " + max + " in city " + m + " on the day " + n);
	}
	
	void minTemp() {
		int min = citydata[0][0], m = 1, n  = 1;
		for(int i=0; i<6; i++)
			for(int j=0; j<5; j++)
				if(min > citydata[i][j]) {
					min = citydata[i][j];
					m = j+1;
					n = i+1;
				}
		System.out.println("Min temperature " + min + " in city " + m + " on the day " + n);
	}
}

class Temperature {
	public static void main(String args[]) {
		Record table = new Record();
		System.out.println("Enter temperature for 5 cities on 6 days:");
		table.getData();
		table.maxTemp();
		table.minTemp();
	}
}
