import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Test {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
       HashMap<String,Integer>map=new HashMap<>();
       map.put("1",0);
       map.put("2",0);
       map.put("3",0);
       map.put("4",0);
       map.put("5",0);

        int[] types = new int[n];
        for(int types_i=0; types_i < n; types_i++){
            types[types_i] = in.nextInt();
            if (types[types_i]==1)
            	map.put("1",map.get("1")+1);

            	else if (types[types_i]==2)
            		map.put("2",map.get("2")+1);
            	else if (types[types_i]==3)
            		map.put("3",map.get("3")+1);
            	else  if (types[types_i]==4)
            		map.put("4",map.get("4")+1);
            	else if (types[types_i]==5)
            		map.put("5",map.get("5")+1);
        }
        
        
        
        
        
        
        
          }}