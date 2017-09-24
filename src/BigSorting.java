import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;
public class BigSorting{
	
	public static void main (String[]args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[]unsorted = new String[n];
		BigInteger[]sorted = new BigInteger[n];
		for (int i =0;i<n;i++) {
			unsorted[i]=scan.next();		
			sorted[i]=new BigInteger(String.valueOf(unsorted[i]));
			
		}
		
	Arrays.sort(sorted);
	for (BigInteger j : sorted)
	System.out.println(j);
	}
	
	
	
}