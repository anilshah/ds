package exceptionpack;

public class Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c;
		a=12;
		b=0;
		c=0;
		
		try{
			
			c=a/b;
		
		}
		catch(ArithmeticException e){
			
			System.out.println("provide number");
		}
		
		finally{
		System.out.println("val=="+c);
		}

	}

}
