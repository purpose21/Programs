import java.io.*;
import java.util.*;

public class QuickSort {

    public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
    String str = scan.nextLine();
    helo(str);   
}

 static void helo (String str){
	 StringBuilder myName = new StringBuilder(str);
	  int count=0;
	 for (int j = 0; j < myName.length()-1; j++) {	
 	if (myName.charAt(j)==myName.charAt(j+1)){
 		myName.setCharAt(j,' ');
 		myName.setCharAt(j+1,' ');	
count++;
}}
 		
String str1 =myName.toString();
str1=str1.replaceAll(" ","");
	 	 
	 if (count>0 && str1.length()>0)
		 helo(str1);
	 else if (str1.length()==0)
		 System.out.println("Empty String");
	 else
		 System.out.println(str1);
}}