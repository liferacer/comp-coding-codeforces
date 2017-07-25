public class BinarySearchTree{
	
	public class Node{
		Node left;
		Node right;
		int key;
		Node(int item){
			left=null;
			right=null;
			key=item;
		}
	}
	
	Node root;
	BinarySearchTree(){
		root=null;
	}
	
	private void insert(int item) {
		// TODO Auto-generated method stub
		root=insertRec(item,root);
	}
	
	private Node insertRec(int item, Node root) {
		// TODO Auto-generated method stub
		if(root==null){
			root=new Node(item);
			return root;
		}
		else if(item<root.key){
			root.left = insertRec(item,root.left);
		}
		else if(item>root.key){
			root.right = insertRec(item,root.right);
		}
		return root;
	}
	
	private void inOrder() {
		// TODO Auto-generated method stub
		inOrderRec(root);
		
	}


	private void inOrderRec(Node root) {
		// TODO Auto-generated method stub
		if(root!=null){
			inOrderRec(root.left);
			inOrderRec(root.right);
			System.out.println(root.key);
		}
		
	}

	public static void main(String args[]){
		BinarySearchTree ob=new BinarySearchTree();
		
		ob.insert(4);
		ob.insert(5);
		ob.insert(2);
		ob.insert(3);
		ob.insert(6);
		
		ob.inOrder();
		
	}

	
	
}