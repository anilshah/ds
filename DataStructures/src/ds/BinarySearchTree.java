package ds;


class Node{
	
	int data;
	Node left, right, nextRight;
	
	Node (int item)
	{
		data = item;
		left = right = nextRight = null;
	}
}

public class BinarySearchTree {
	
	Node root;
	
	void connect(Node n){
		
		n.nextRight = null;
		
		connectNode(n);
				
	}
	
	void connectNode(Node n)
	{
		if(n==null)
			return;
		
		
		if(n.left!=null)
			n.left.nextRight = n.right;
		
			
		if(n.right!=null)
		n.right.nextRight =(n.nextRight!=null)?n.nextRight.left:null;
		
		connectNode(n.left);
		connectNode(n.right);
		
			
	}

}


