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
		System.out.print("Enter Name: ");
		name = sc.nextLine();
		System.out.print("Enter Party: ");
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
		int spoiltCount = 0;
		label: while(true){
			System.out.println("Enter Voter's Choice\nPress -1 to end elections");
			int choice = sc.nextInt();
			switch(choice){
				case 1:
				case 2:
				case 3:
				case 4:
				case 5:
					object[choice-1].count++;
					break;
				
				case -1:
					break label;
				default:
					System.out.println("Spoilt Count");
					spoiltCount++;
			}
		}
		Candidate winner;
		winner = object[0];
		for(int i = 0; i<5; i++){
			System.out.println(object[i].name + " : " + object[i].count);
			if(winner.MaxCompare(object[i])){
				winner = object[i];
			}
		}
		System.out.println("Winner: " + winner.name + " - " + winner.count + " - " + winner.party + " " + "\nSpoilt counts = " + spoiltCount);		
	}
}
