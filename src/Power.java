import java.util.*;
import java.io.*;

public class Power{
	
	
	
	public static void main(String[]args){
		

		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();

		int y = scan.nextInt();		
	
	System.out.println(hello(x,y));
	
	}

	 static int hello (int a, int b){

if (b==0)
	return 1;
 
else 
	return a*hello(a,b-1);

}}


