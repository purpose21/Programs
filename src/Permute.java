import java.io.*;
import java.util.*;

public class Permute {

    public static void main(String[] args) {

    
    Scanner scan = new Scanner(System.in);
    int q = scan.nextInt();
    for (int i = 0; i < q; i++) {
    	int count=0;
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[]arr1=new int[n];
		int[]arr2=new int[n];
		for(int j =0;j<n;j++){
			arr1[j]=scan.nextInt();
			
		}
		
		for(int l =0;l<n;l++){
			arr2[l]=scan.nextInt();
			
		}
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		for (int m = 0; m < n; m++) {
			if ((arr1[m]+arr2[n-m-1])>=k)
				count++;
			
		}
		
	
    if (count==n)
   System.out.println("YES");
    else
    	System.out.println("NO");
    }
    }
}