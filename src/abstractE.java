import java.util.*;
abstract class Boo{
	String title;
	abstract void setTitle(String s);
	String getTitle(){
		return title;
	}
}

class MyBoo extends Boo{
    
    void setTitle(String s ){
        
this.title=s;    }

	

		
	
    
}
public class abstractE{
	
	public static void main(String []args){
		//Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
		Scanner sc=new Scanner(System.in);
		String title=sc.nextLine();
		MyBoo new_novel=new MyBoo();
		new_novel.setTitle(title);
		System.out.println("The title is: "+new_novel.getTitle());
      	sc.close();
		
	}
}