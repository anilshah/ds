package binaryTree;

class Node{
	
int data;
Node left, right, parent;

public Node(int item)
{
	data = item;
	left = right = null;
}
}
//dynamic ip address to any mac address
//refresh, increase expiry time
//binary tree, left right connect nodes at same level
//array - find duplicate elements in the array - using hashmap
//authrization and authentication
//how hashmap works, concurrent hashmap - internal implementation
//garbage collection
// circuit breaker
//deadlock - recover from deadlock
//diner philosophal problem
//code review practices
//

public class BinarySearchTree {
	
	Node root;
	
	public static void main (String args[]){
		
		BinarySearchTree tree = new BinarySearchTree();
		tree.root = new Node(4);
		tree.root.left = new Node(8);
		tree.root.right = new Node(5);
		tree.root.left.left = new Node(1);
		tree.root.left.right = new Node(3);
		
		System.out.println(tree);
		//tree.checkIsBinaryTree(tree);
		
		//traverse(tree.root);
		if(isBST(tree.root))
		{
			
		}
		
	}
	
	public Boolean checkIsBinaryTree(BinarySearchTree t){
		
		int val;
		int rootVal = t.root.data;
		
		System.out.println("rootVal=="+rootVal);
		
		if(rootVal<t.root.left.data)
		{
			
			
		}
		
		return false;
	}
	
	public static void traverse(Node n){
		Node leftNode = null;
		Node rightNode = null;
		if(null!=n){
			System.out.println("=====node val===="+n.data);
			
			
			if(null!=n.left){
				System.out.println("node left value=="+n.left.data);
				if(n.left.data>n.data )
				{
					System.out.println("this is not a BST");
					return;
				}
				leftNode = n.left;
			}
			if(null!=n.right){
				
				System.out.println("right node=="+n.right.data);
				if(n.right.data<n.data )
				{
					System.out.println("this is not a BST");
					return;
				}
				rightNode = n.right;
				
			}
		}
		else
			return;
		
		traverse(leftNode);
		traverse(rightNode);
		
		
	}
	
	
	public static boolean isBST(Node n){
		
		Node left = null;
		Node right = null;
		
		if(null!=n){
			System.out.println("root node=="+n);
			if(null!=n.left || null!=n.right)
			{
				if(n.left.data>n.data){
					System.out.println("left node=="+n.left.data);
					System.out.println("not a bst");
					left = n.left;
					return true;
				}
				
				if(n.right.data<n.data){
					System.out.println("right node=="+n.right.data);
					System.out.println("not a bst");
					right = n.right;
					return true;
				}
			}
			else
			{
				return true;
			}
		}
		
		isBST(left);
		isBST(right);
		
		return false;
	}

} 

