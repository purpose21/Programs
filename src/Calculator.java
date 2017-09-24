import java.io.*;
import java.util.Scanner;


class Calci{
	
	int power(int n,int p) throws Exception{
		int a=0;
		if ((n>0 && p >0) || (n <0 && p>0) || (n>0 && p<0)){
		a = (int) Math.pow(n, p);
		return a;
		
}else {
	
	throw new Exception("n and p should be non-negative");
}
	}
	
	
	
}

class Calculator{

    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int T=in.nextInt();
        while(T-->0)
        {
            int n = in.nextInt();
            int p = in.nextInt();
            Calci myCalci = new Calci();
            try
            {
                int ans=myCalci.power(n,p);
                System.out.println(ans);
                
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }

    }
}