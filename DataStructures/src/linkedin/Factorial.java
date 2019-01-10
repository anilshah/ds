package linkedin;

public class Factorial {

	static int f=1, res;
	public static void main(String[] args) {
		
		res = getFact(3);
		
		System.out.println("factorial is=="+res);
		
	}
	
	static int getFact(int num){
		
		if(num>0){
			f = f*num;
			getFact(num-1);
		}
		
		return f;
	}
}
