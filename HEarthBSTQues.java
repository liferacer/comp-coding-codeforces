import java.util.*;

public class HEarthBSTQues {
	
	public class Node{
		int key;
		Node left;
		Node right;
		Node(int item){
			left=null;
			right=null;
			key=item;
		}
	}
	
	Node root;
	HEarthBSTQues(){
		root=null;
	}
	

	private void insert(int item) {
		// TODO Auto-generated method stub
		root=insertRec(root,item);
	}
	
	private Node insertRec(Node root, int item) {
		// TODO Auto-generated method stub
		if(root==null){
			root=new Node(item);
		}
		else if(root.key>item){
			root.left=insertRec(root.left,item);
		}
		else if(root.key<item){
			root.right=insertRec(root.right,item);
		}
		
		return root;
	}

	private void preOrder() {
		// TODO Auto-generated method stub
		preOrderRec(root);
	}


	private void preOrderRec(Node root ) {
		// TODO Auto-generated method stub
		
		if(root!=null){
			System.out.println(root.key);
			preOrderRec(root.left);
			preOrderRec(root.right);
		}
		
/*		if(root!=null){
			System.out.println(root.key);
			preOrderRec(root.left,m,n);
			preOrderRec(root.right,m,n);
		}
		
		for(int i=0;i<n;i++){
			if(root!=null){
				if(root.left.key==m||root.right.key==m){
					System.out.println(root.key);
					preOrderRec(root.left,m,n);
					preOrderRec(root.right,m,n);
				}
				else
				{
					continue;
				}	
			}
			
		}*/
		
	}
	
	private void findrootNode(int m) {
		// TODO Auto-generated method stub
		root=findrootNodeRec(root,m);
	}

	private Node findrootNodeRec(Node root, int m) {
		// TODO Auto-generated method stub
		if(root.key>m){
			root=findrootNodeRec(root.left,m);
		}
		else if(root.key<m){
			root=findrootNodeRec(root.right,m);
		}
		else if(root.key==m){
			return root;
		}
		
		return root;
	}


	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		HEarthBSTQues ob=new HEarthBSTQues();
		int n=sc.nextInt();
		int arr[]=new int[n]; 
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			ob.insert(arr[i]);
		}
		int m=sc.nextInt();
		
		ob.findrootNode(m);
		
		ob.preOrder();
		
	}
}
