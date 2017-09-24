import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ThunderCloud {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        
        int count = 0;
        for (int i = 0; i < n-2; i++) {
        	if ( ( c[i+1]==0 || c[i+1]==1 ) && c[i+2]==0){
        		count++;
        		i=i++;
        	}
        	else if (c[i+1]==0 && c[i+2]==1){
        		count++;
        		
        		
        	}
        
        		
        	}
        if (count>=n/2)
        System.out.println(count);	
        else
            System.out.println(count+1);	

        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
			
		
        
    }
}
