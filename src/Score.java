import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Score {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];
        for(int scores_i=0; scores_i < n; scores_i++){
            scores[scores_i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] alice = new int[m];
        for(int alice_i=0; alice_i < m; alice_i++){
        	int count=1;
            alice[alice_i] = in.nextInt();
            int al=alice[alice_i];
            
            for (int i = 0;i<n-1;i++){
            	if (al<scores[i] && scores[i]!=scores[i+1])
              	count++;}
            if (scores[n-1]>al)
            		count++;
            
            
            System.out.println(count);
        }


    
    }
}
