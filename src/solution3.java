import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import static java.util.Arrays.sort;

public class solution3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c = in.nextInt();
        int m = in.nextInt();
        int[] p = new int[n];
        for(int p_i=0; p_i < n; p_i++){
            p[p_i] = in.nextInt();
            
        }
        Arrays.sort(p);
        
       
        if (p[0]>c*m)
        	System.out.println("No" +p[n-1]);
    	
        else 
        	System.out.println("Yes" + p[n-1]);
    }
}
