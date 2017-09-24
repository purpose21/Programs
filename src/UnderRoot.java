import java.io.*;
import java.util.*;

public class UnderRoot {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int T = scanner.nextInt();
    for (int i = 0; i < T; i++) {
    	
    	int a = scanner.nextInt();
    	int b =scanner.nextInt();
    	int count = 0;

    	for (int j = a; j <=b ; j++) {
    		int temp = (int)Math.sqrt(j);
    		if (j%Math.sqrt(j)==0){
    			count++;
    			
    			
    		}
			
		}
    	System.out.println(count);
		
	}
    
    
    
    }
}