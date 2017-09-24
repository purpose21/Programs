import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
class Nodes{
    Nodes left,right;
    int data;
    Nodes(int data){
        this.data=data;
        left=right=null;
    }
}
class BSTtraverse{
	static void levelOrder (Nodes root){
		Queue<Nodes>q=new LinkedList();
		
		if (root!=null)
		
		q.add(root);
	
		
	while (!q.isEmpty()){
		Nodes cr = q.poll();
			System.out.print(cr.data+" ");	

			if (cr.left!=null)	
				q.add(cr.left);
			if (cr.right!=null)
				
				q.add(cr.right);
				
				
			}
			
		}
		
		
	
	    

public static Node insert(Node root,int data){
    if(root==null){
        return new Node(data);
    }
    else{
        Node cur;
        if(data<=root.data){
            cur=insert(root.left,data);
            root.left=cur;
        }
        else{
            cur=insert(root.right,data);
            root.right=cur;
        }
        return root;
    }
}
public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }	
}