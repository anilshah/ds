package ds;

public class BST {

	public static void main(String[] args) {
		Tree t = new Tree();
		Nodes root = null;
		
		//insert root node
		root = t.insertNode(root, 8);
		//root.left = t.insertNode(root, 5);
		
	}
}

class Nodes{
	
	int data;
	Nodes left, right;
}

class Tree{
	
	Nodes insertNode(Nodes n, int val){
		
		if(n==null){
			
			return createNewNode(val);
		}
		
		
		return n;
	}
	
	Nodes createNewNode(int v){
		
		Nodes n = new Nodes();
		n.data = v;
		n.left = null;
		n.right = null;
		
		return n;
		
	}
	
	void inOrderTraversal(Nodes n){
		
		if(n==null)
			return;
		
		inOrderTraversal(n.left);
		
		System.out.println("data=="+n.data);
		inOrderTraversal(n.right);
		
	}
}
