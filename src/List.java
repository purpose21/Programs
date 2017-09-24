import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class List {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
       	ArrayList arr = new ArrayList();

        for (int i = 0; i <n;i++){
        	arr.add(scan.nextInt());

        }
        int j = scan.nextInt();
        
while (j-->0){
	
	String s = scan.next();
	
	if (s.equals("Insert")){
		
		arr.add(scan.nextInt(), scan.nextInt());
	}
	
	
	else if (s.equals("Delete")){
		
		arr.remove(scan.nextInt());
	} 
}
while(!arr.isEmpty()){
	int ir = 0;

System.out.println(arr.remove(ir));
    }}
}
