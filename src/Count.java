import java.io.*;
import java.util.*;

public class Count {

    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();

int[]arr=new int[n];

for(int i =0;i<n;i++){
	arr[i]=scan.nextInt();
}
Arrays.sort(arr);
    
for(int j =0;j<n;j++){
	int count=0;

	for (int k = 0; k < n; k++) {
		if (j==arr[k])
			count++;
	}
	System.out.print(count);
	
	
}

    
    }
}