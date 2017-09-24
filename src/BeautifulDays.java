import java.io.*;
import java.util.*;

import javax.xml.bind.ParseConversionEvent;

public class BeautifulDays {

    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int one =scan.nextInt();
int last =scan.nextInt();
int k =scan.nextInt();
int count =0;
int numb;

for (int num = one; num <=last; num++) {
	numb=num;
	
	int reversenum=0;

	  for( ;num != 0; )
      {
          reversenum = reversenum * 10;
          reversenum = reversenum + num%10;
          num = num/10;
      } 
	  num=numb;
	if ((Math.abs(( numb-reversenum)%k))==0){
		count++;
		
		
	}
	
	
}

System.out.println(count);



    
    
    
    
    
    
    
    }
}