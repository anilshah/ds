package finalkeyword;

public class Test {

	public static void main(String[] args) {
		//final int a=8;
		
		/*A ob = new A(8);
		ob.dis();
*/	
		B b = new B(87,7);
		b.disB();
	}

}
class A{
	int x;
	
	A(int x){
		this.x = x;
	}
	void dis(){
		System.out.println(x);
	}
	
}
class B extends A{
	
	int x=90,y;
	B(int x,int y){
		super(x);
		this.y = y;
	}
	void disB(){
		System.out.println(super.x+"  "+this.x);
	}
}
