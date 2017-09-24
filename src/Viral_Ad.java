import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Viral_Ad {

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int n = scanner.nextInt();
int start = 5;
int memO=0;
int memL=0;

for (int i = 0; i < n; i++) {
	memL=Math.floorDiv(start, 2);
	start=memL*3;
	memO=memO+memL;
}
    
    System.out.println(memO);
    
    }
}