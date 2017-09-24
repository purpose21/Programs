import java.lang.*;
import java.lang.Comparable;
public class Binary {

	
	public static void main (String []args){
	
	int n =5;
	
String m = Integer.toBinaryString(n);
int count = 1;


for (int i=2;i<m.length();i++){
	
	
	
	if (m.charAt(i) == m.charAt(i-2) && m.charAt(i)=='1'){
		
		count++;

	}
	
	
	else {
		
		count=0;
	}

}

System.out.println(count);


}
	}


