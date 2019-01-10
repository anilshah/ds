package linkedin;

public class tree {
	
	

}

class Nod{
	
	int data;
	Node left, right;
	Nod(int d){
		
		this.data = d;
		left = right=null;
	}
	
}

class bnt{
	
	Nod root;
	Nod createBT(int d){
		
		Nod n= new Nod(d);
		return n;
	}
	
}