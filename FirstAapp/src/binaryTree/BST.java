package binaryTree;

public class BST {
public static void main(String[] args) {
	
	BStree bs = new BStree();
	ND root = null;
	root = bs.insertNode(root, 8);
	root = bs.insertNode(root, 4);
	
}
}

class ND{
	
	int data;
	ND left, right;
}

class BStree{
	
	//Node root = null;
	
	ND insertNode(ND n, int val){
	
		if(n==null){
			return createNewNode(val);
		}
		
		if(val<n.data){
			//create leftNode
			n.left = insertNode(n.left, val);
		}
		if(val>n.data){
			n.right = insertNode(n.right, val);
		}
		
		return n;
	}
	
	ND createNewNode(int val){
		
		ND n = new ND();
		n.data = val;
		n.left = null;
		n.right = null;
		
		return n;
		
	}
}
