import java.util.*;

class Persons {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Persons(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print Persons data
	public void printPersons(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName
			+ 	"\nID: " + idNumber); 
	}
	 
}
class Students extends Persons{
	int[] t1 ;
	Students(String firstName, String lastName, int identification,int [] testScores) {
		super(firstName, lastName, identification);
	this.t1 = testScores;
	}

	public String  calculate() {



		int totalScore= 0;
		int score=0;
for (int i =0; i < t1.length;i++){
	score=t1[i];
	totalScore= score+totalScore;
	
	
} 
int newScore=totalScore/t1.length;
int length= t1.length;
if (totalScore/t1.length>=90 && totalScore/t1.length <=100){
 return "O";
}

else if (totalScore/t1.length>=80 && totalScore/t1.length <90){
	 return "E";
	}


else if (totalScore/t1.length>=70 && totalScore/t1.length <80){
	 return "A";
	}

else if (totalScore/t1.length>=55 && totalScore/t1.length <70){
	 return "P";
	}


else if (totalScore/t1.length>=40 && totalScore/t1.length<55){
	 return "D";

	}

else if (totalScore/t1.length < 40){
	 return "T";
	 }
return "";
	}}


class SolutionN {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Students s = new Students(firstName, lastName, id, testScores);
		s.printPersons();
		System.out.println("Grade: " + s.calculate());
	}
}