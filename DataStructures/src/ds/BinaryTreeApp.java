package ds;

public class BinaryTreeApp {
	
	public static void main(String[] args) {
		
		TreeNode root = null;
		BT t = new BT();
		
		root = t.createNode(8);
		root.left = t.createNode(5);
		root.right = t.createNode(9);
		root.left.left = t.createNode(4);
		root.left.right = t.createNode(3);
		root.right.left = t.createNode(6);
		root.right.right = t.createNode(7);
		
		System.out.println("in order");
		t.inorder(root);
		
		System.out.println("pre order");
		t.preorder(root);
		
		System.out.println("post order");
		t.postorder(root);
		
		/**
		TreeNode bstRoot = null;
		BT bst = new BT();
		
		bstRoot = bst.insertNode(bstRoot, 8);
		bstRoot = bst.insertNode(bstRoot, 5);
		bstRoot = bst.insertNode(bstRoot, 4);
		bstRoot = bst.insertNode(bstRoot, 9);
		
		**/
		
	}

}

class TreeNode{
	
	int data;
	TreeNode left;
	TreeNode right;
	
	//create leaf node
	public TreeNode(int data){
		
		this.data = data;
		left= right = null;
		
	}
	
}

class BT{
	
	TreeNode createNode(int val){
		
		TreeNode n1 = new TreeNode(val);
		
		return n1;
	}
	
	public void inorder(TreeNode n)
	{
		if(n==null)
			return;
		
		inorder(n.left);
		System.out.println("node val=="+n.data);
		
		inorder(n.right);
		
		
	}
	
	public void preorder(TreeNode n)
	{
		if(n==null)
			return;
		
		System.out.println("node val=="+n.data);
		preorder(n.left);
		
		
		preorder(n.right);
		
		
		
	}
	
	public void postorder(TreeNode n)
	{
		if(n==null)
			return;
		
		postorder(n.left);
		postorder(n.right);
		System.out.println("node val=="+n.data);
		
		
		
		
	}
	
	TreeNode insertNode(TreeNode n, int val){
		
		if(n==null)
			return createNode(val);
		
		if(val<n.data){
			
			n.left = insertNode(n.left, val);
		}
		
		if(val>n.data)
			n.right = insertNode(n.right, val);
			
		return n;
		
	}
	
	
	
}
