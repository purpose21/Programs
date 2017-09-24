import java.util.ArrayList;

class LinkList {
     int data;
     LinkList next;


void ReversePrint(LinkList head) {
	
	ArrayList<Integer>arr = new ArrayList();
	
 if (head==null){
	 
	 
	 return ;
 }
 
 
 else {
	 while (head!=null){
		 arr.add(head.data);
		 head=head.next;
	
		 	 
	 }}
 int count = arr.size();
	 
	 for (int i =count-1;i>count ; i--){
		 
		System.out.println(arr.get(i).intValue());
		 
		 
	 }
	 
	 
 }

 
 
 
 
 
 

}
}