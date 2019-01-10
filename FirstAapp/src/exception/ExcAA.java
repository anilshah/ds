package exception;

public class ExcAA {

	/*public static void main(String[] args) {
		int a = 5,b=2;
		int ar[]={6,7,34};
		try{
			System.out.println(a/b);
			System.out.println(ar[9]);
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}catch(ArithmeticException e){
			e.printStackTrace();
		}
		
		System.out.println("hhhh");
		

	}*/
	
	public static void main(String[] args) {
		int a = 5,b=5;
		int ar[]={6,7,9,34};
		try{
			System.out.println(a/b);
			System.out.println(ar[1]);
		}catch(ArrayIndexOutOfBoundsException | ArithmeticException e){
			e.printStackTrace();
		}
		
		System.out.println("hhhh");
		

	}

}
