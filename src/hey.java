import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class hey {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String w = in.next();
        int len=w.length();
char [] a=w.toCharArray();
String s ="aeiouy";

int count=0;

for (int i=0;i<len-1;i++){
	
	 if ( a[i]==a[i+1]){
		 count=count+2;
	 }
	
    if (s.indexOf(a[i])>=0 && s.indexOf(a[i+1])>=0 )   {
    	count++;
    	count++;
    	}

   // 	if (s.indexOf(a[i])<0){
    //		count--;
    		
    	//}
    	if(count>=2){
    		System.out.println("No");
    		break;
    		
    	}}

if(count<2)
		System.out.println("Yes");

    

    
    }
	
	
    }

