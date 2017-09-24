import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}


class Student extends Person{
	
	int test[];
	
 Student(String firstName, String lastName, int identNumber, int[]testScore) {
super(firstName, lastName, identNumber);
	
this.test=testScore;
}		

public String calculate () {
	
	int totalScore= 0;
	int score=0;
for (int i =0; i < test.length;i++){
score=test[i];
totalScore= score+totalScore;


} 
int newScore=totalScore/test.length;
int length= test.length;
if (totalScore/test.length>=90 && totalScore/test.length <=100){
return "O";
}

else if (totalScore/test.length>=80 && totalScore/test.length <90){
 return "E";
}


else if (totalScore/test.length>=70 && totalScore/test.length <80){
 return "A";
}

else if (totalScore/test.length>=55 && totalScore/test.length <70){
 return "P";
}


else if (totalScore/test.length>=40 && totalScore/test.length<55){
 return "D";

}

else if (totalScore/test.length < 40){
 return "T";
 }
return "";
}

	


	
	

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
}



class Solution {
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
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}
}