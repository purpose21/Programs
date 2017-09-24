import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

public class Codility1 {
    public static void main(String[]args) {
       	String ip1 = "A586QK";
    	String ip2= "JJ653K";
    	char[]arr1 = ip1.toCharArray();
    	char[]arr2 = ip2.toCharArray();
    	int count = 1;

    	int []am =new int[arr1.length];
    	int []pm = new int[arr2.length];
    	
    	for(int i=0;i<arr1.length;i++){
    		if (arr1[i]!=(int)arr1[i]){
    			am[i]=(int) convertval(arr1[i]);
    		}
    		else{
    			am[i]= arr1[i];
    		}
    		if (arr2[i]!=(int)arr2[i]){
    			pm[i]=(int)convertval(arr2[i]);
    		}else{
    			pm[i]=arr2[i];
    		}
    		if (am[i] > pm[i]) {
    			count++ ;}
    		
    		
    		}
    		System.out.println(count);
    	}

    public static int convertval(char arr2){	
    
    	switch(arr2){
    	    case 'A':
    			return 14;
    		case 'K':	
    			return 13;

    	    case 'Q':
    			return 12;
    			
    	    case 'J':
    			return 11;
    	    case 'T':
    			return 10;
    	    default:
    			return 0;

    	}}}