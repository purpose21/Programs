import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MeanMedMod {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
   
    	Scanner scan = new Scanner(System.in);
    
    	int N = scan.nextInt();
    	
    	
    	
    	
     	

    	int[] myArr=new int[N];
    	for(int x =0;x<N;x++){
    		
    		int V= scan.nextInt();
    myArr[x]=V;		
    		
    	} 
    	
    	
    	int Mean =0;
    	
    	
    	
    
    for (int i =0;i<N;i++){
    	
    	Mean =Mean+ myArr[i];
    	
    }
    
    
Arrays.sort(myArr);  
int Med = N/2;
int Median = myArr[Med]+myArr[Med+1]/2;    
    
int Mode = myArr[0];    
    System.out.println(Mean/N );
    System.out.println(Mode);
    System.out.println(Median);

    
    
    
    }
}