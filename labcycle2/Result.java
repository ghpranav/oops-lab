import java.io.*;
import java.util.*;

class Student {
	int rno;
	
	public void getNumber(int rno) {
		this.rno = rno;
	}
	
	public void putNumber() {
		System.out.println("Roll Number: "+this.rno);
	}
}

class Test extends Student {
	float sub1,sub2;
	
	public void getMarks(Scanner sc) {
		System.out.print("Marks in subject 1: ");
		sub1 = sc.nextFloat();
		System.out.print("Marks in subject 2: ");
		sub2 = sc.nextFloat();
	}
	
	public void putMarks() {
		System.out.println("Subject 1: "+sub1);
		System.out.println("Subject 2: "+sub2);
	}
}

interface Sports {
	public void sportWeight(Scanner sc);
	public void disp();
}

class Result extends Test implements Sports {
	float sw,total;
	
	public void sportWeight(Scanner sc) {
		System.out.print("Sports Weightage: ");
		this.sw = sc.nextFloat();
	}
	
	public void disp() {
		System.out.println("Sports Weightage: "+sw);
		this.total = this.sw + this.sub1 + this.sub2;
		System.out.println("Total score: "+this.total);
	}
	
	public static void main(String args[]) {
		int n,i,rn;
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter number of students: ");
		n = sc.nextInt();
		Result s[] = new Result[n];

		System.out.println("Enter student details:");	
		for(i=0;i<n;i++) {
			s[i] = new Result();
			System.out.print("Student Roll Number: ");
			rn = sc.nextInt();
			s[i].getNumber(rn);
			s[i].getMarks(sc);
			s[i].sportWeight(sc);
			System.out.println();
		}
	
		for(i=0;i<n;i++) {
			s[i].putNumber();
			s[i].putMarks();
			s[i].disp();
			System.out.println();
		}

		sc.close();
	}
}
