//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;
import java.util.Map;

class newMap{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String, Integer> nMap = new HashMap<String, Integer>();   

        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            


       
       
       if(n >= 1 && n <= 100000 ){
    	   nMap.put(name, phone);
    	   
       }
     
    	   
    	   
       
       
      
      
       
       
       
       
        
        
        
        while(in.hasNext()){
            String s = in.next();
            
         if (  nMap.containsKey(name)==true){
        	 
     	    System.out.println(name); 


        	    System.out.println(nMap.get(name)); 
        	 
         }    	   
        	   
                 }}
        in.close();
    }
}
