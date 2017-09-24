import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Eshop {

    static int getMoneySpent(int[] keyboards, int[] drives, int s){
    	int count = 0;
    	
Arrays.sort(keyboards);
Arrays.sort(drives);
int temp=0;
if (keyboards[0]+drives[0]>s)
	return -1;
else {
for (int i = 0; i < keyboards.length; i++) {
	int a= keyboards[i];
	
	for (int j = 0; j < drives.length; j++) {
		count=a+drives[j];
if (count==s)
	temp= count;

else {
	
	if (count>temp && count<s){
		temp=count;
		
		
		
	}
	
}


	}
}
}
    
    
    
    return temp;
    
    
    
    
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] keyboards = new int[n];
        for(int keyboards_i=0; keyboards_i < n; keyboards_i++){
            keyboards[keyboards_i] = in.nextInt();
        }
        int[] drives = new int[m];
        for(int drives_i=0; drives_i < m; drives_i++){
            drives[drives_i] = in.nextInt();
        }
        //  The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
        int moneySpent = getMoneySpent(keyboards, drives, s);
        System.out.println(moneySpent);
    }
}
