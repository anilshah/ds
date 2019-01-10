package binaryTree;



class Tree{
	
	Nodes insertNode(Nodes n1, int val){
		
		if(n1==null){
			return createNewNode(val);
		}
		if(val<n1.data){
			
			n1.left = insertNode(n1.left, val);
		}
		else{
			n1.right = insertNode(n1.right, val);
		}
		
		
		return n1;
	}
	
	
	Nodes createNewNode(int v){
		
		Nodes nroot = new Nodes();
		nroot.data = v;
		nroot.left = null;
		nroot.right = null;
		return nroot;
	}
}

class Nodes{
	
	int data;
	Nodes left, right;
	
}

public class BinaryTreeEx {

	public static void main(String[] args) {
		
		Tree t = new Tree();
		Nodes root = null;
		root = t.insertNode(root, 8);
		root = t.insertNode(root, 3);
		root = t.insertNode(root, 10);
		
		System.out.println("node=="+root);
		
	}

	
}


class Nd2{
	
	int data2;
	Nd2 left, right;
}

class BT2{
	
	Nd2 createNd2(int v){
		
		Nd2 n2 = new Nd2();
		n2.data2=v;
		n2.left =null;
		n2.right = null;
		return n2;
	}
	
	void insertNode2(Nd2 n2, int v){
		
		if(n2==null){
			
			createNd2(v);
		}
		
		if(v<n2.data2){
			
			insertNode2(n2.left, v);
		}
		if(v>n2.data2){
			
			insertNode2(n2.right, v);
		}
	}
	
	void inorder(Nd2 n2){
		
		if(n2==null)
			return;
		
		inorder(n2.left);
		System.out.println("data="+n2.data2);
		inorder(n2.right);
		
	}
	void preorder(Nd2 n2){
		
		if(n2==null)
			return;
		
		System.out.println("data=="+n2.data2);
		preorder(n2.left);
		preorder(n2.right);
	}
	
	void postorder(Nd2 n2){
		
		if(n2==null)
			return;
		
		
		preorder(n2.left);
		preorder(n2.right);
		System.out.println("data=="+n2.data2);
	}
}


