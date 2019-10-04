import java.util.Scanner;

class Candidate{
	Scanner sc = new Scanner(System.in);
	int count;
	String name, party;
	Candidate(){
		count = 0;
	}
	boolean MaxCompare(Candidate object){
		return (object.count >= count);
	} 
	void getInfo(){
		System.out.println("Enter Name");
		name = sc.nextLine();
		System.out.println("Enter Party");
		party = sc.nextLine();
	}
}
class Election{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Candidate[] object = new Candidate[5];
		for(int i = 0; i<5; i++){
			object[i] = new Candidate();
			object[i].getInfo();
		}
		int SpoilCount = 0;
		label: while(true){
			System.out.println("Enter Voter's Choice\nPress -1 to end elections");
			int choice = sc.nextInt();
			switch(choice){
				case 1:{
					object[0].count++;
					break;
				}
				case 2:{
					object[1].count++;
					break;
				}
				case 3:{
					object[2].count++;
					break;
				}
				case 4:{
					object[3].count++;
					break;
				}
				case 5:{
					object[4].count++;
					break;
				}
				case 404:{
					break label;
				}
				default:{
					System.out.println("Spoilt count");
					SpoilCount++;
				}
			}
		}
		Candidate winner;
		winner = object[0];
		for(int i = 0; i<5; i++){
			if(winner.MaxCompare(object[i])){
				winner = object[i];
			}
		}
		System.out.println("WINNER " + winner.name + " " + winner.count + " " + winner.party + " " + "\n Spoilt count = " + SpoilCount);		
	}
}
