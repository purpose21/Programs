import java.io.*;
import java.util.*;

public class Segment {

    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int count = 0;
int n = scan.nextInt();
int k=scan.nextInt();
ArrayList<Integer>arr=new ArrayList<>();
for (int i = 0; i < n; i++) {
	int a = scan.nextInt();
	int b =scan.nextInt();
	if (b==1)
		arr.add(a);
	else 
		count=count+a;
	
}
int m =1;
Collections.sort(arr);  
Collections.reverse(arr);
for (int j :arr) {
	
	if (k>m || k==m)
		count=count+j;
	else
		count=count-j;
	m++;
}
    System.out.println(count);
    }
}