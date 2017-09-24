import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Hello {

    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
String one = scan.next();
int step = 0;
int valley = 0;

for (int i = 0; i < n; i++) {
if (one.charAt(i)=='U'){
	step = step+1;
}
if (one.charAt(i)=='D'){
	step = step-1;
}

if ((step==0) && i!=1){
	valley = valley+1;
}
	
}
  System.out.println(valley);  
    
    }
}