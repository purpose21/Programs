import java.io.*;
import java.util.*;

public class Toy {

    public static void main(String[] args) {
    	
Scanner scan= new Scanner(System.in);
    int N = scan.nextInt();
    int count = 1;
    int num=0;
    
    int[] arr = new int[N];
    for(int i = 0;i<N;i++){
    	arr[i]=scan.nextInt();
    	   	
    	
    }
    Arrays.sort(arr);
    int temp=arr[0];
    for (int i = 1; i < arr.length; i++) {
if (temp+4>=arr[i])
	continue;   
        
    else 
    	count++;
temp=arr[i];
    }System.out.println(count);
    
    }
}