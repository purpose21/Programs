import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Mouse {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            
            
            int A = Math.abs(z-x);
            int B = Math.abs(y-z);
            
            if (A==B)
            	System.out.println("Mouse C");
            
            else if (A>B)
            	System.out.println("Cat B");
            else if (A<B)
            	System.out.println("Cat A");

        }
        
        
    }
}
