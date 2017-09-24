import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class factorial {

    public static void main(String[] args) {
        int N = 3;
        if (N==1){
            System.out.println(1);    	
            }
        else {	
        	Recursion re = new Recursion();
        	int n = re.Factorial(N);
System.out.println(n);        	
        
        }
        
   
    }
}
    
 class Recursion{
	public int Factorial(int n){
			 if (n==1){
				 return 1;
			 }else {
int man =n*(Factorial(n-1));
		 return man;
			 }

	 }

 }
 
 