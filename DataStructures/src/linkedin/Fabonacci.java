package linkedin;

public class Fabonacci {

	static int f;
	public static void main(String[] args) {
		
		f = getFab(7);
		
		System.out.println("fab=="+f);
	}
	
	
	static int getFab(int val){
		
		
		if(val<=2){
			return 1;
		}
		f = getFab(val-1) + getFab(val-2);
		
		return f;
	}
}
