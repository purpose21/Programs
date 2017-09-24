import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinDis {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int A[] = new int[n];
        int d = in.nextInt();
        int dist=0;
        for(int A_i=0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
        }
        
        for (int i = 0; i < A.length; i++) {
			int temp=A[i];
        	
        	for (int j = 0; j < A.length; j++) {
        		
        			if (A[i]-A[j]==d  && i!=j )
dist++;        		
				
			}
        	
        	
		}
      
        System.out.println(dist);
        
        
    }
}
