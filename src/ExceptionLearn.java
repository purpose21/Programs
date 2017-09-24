import java.util.Scanner;

class ExceptionLearn{
	
	public static void main (String[]args){
		
		
		
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		
	try {	
		
		int i = Integer.parseInt(str);
		System.out.println(i);
	}
	catch (NumberFormatException e){
System.out.println("Bad String");
	}
	

	}
	
	
	
	
	
	
}