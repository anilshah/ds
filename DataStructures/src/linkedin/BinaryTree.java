package linkedin;

public class BinaryTree {
	
	public static void main(String[] args) {
		
		BT tree = new BT();
		Node root = null;
		
		root = tree.createNode(8);
		root.left = tree.createNode(5);
		root.right = tree.createNode(7);
		
	}

}

class Node{
	
	int data;
	Node left, right;
	
	Node(int data){
		
		this.data = data;
		left = right = null;
	}
}


class BT{
	
	Node root;
	
	Node createNode(int data){
		
		Node n = new Node(data);
		
		return n;
	}
	
	
	public void inordert(Node n){
		
		if(null==null)
			return;
		
		inordert(n.left);
		System.out.println("data=="+n.data);
		inordert(n.right);
		
	}
	
	
}
