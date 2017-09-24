import java.io.*;
import java.util.*;

class Nodes {
	int data;
	Nodes next;
	Nodes(int d){
        data=d;
        next=null;
    }
	
}
class Solution24 { 
	public static Nodes removeDuplicates(Nodes head) {
  
		
		if (head==null || head.next==null){
			return head;
			}
		
		
		if (head.data==head.next.data){
		head.next=head.next.next;
		removeDuplicates(head);}
		else 
			removeDuplicates(head.next);

			
			
		
return head;
  }
	public static  Nodes insert(Nodes head,int data)
    {
        Nodes p=new Nodes(data);			
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Nodes start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(Nodes head)
        {
              Nodes start=head;
              while(start!=null)
              {
                  System.out.print(start.data+" ");
                  start=start.next;
              }
        }
        public static void main(String args[])
        {
              Scanner sc=new Scanner(System.in);
              Nodes head=null;
              int T=sc.nextInt();
              while(T-->0){
                  int ele=sc.nextInt();
                  head=insert(head,ele);
              }
              head=removeDuplicates(head);
              display(head);

       }
    
}