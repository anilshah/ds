package ds;

public class PrimeNumber {
	
	public static void main(String[] args) {
		//checkPrime(3);
		//checkIsPrime(29);
		int i=0;
		while(i<9){
			
			int res = fib(i);
			System.out.println(res);
			i++;
		}
	}
	
	static void checkPrime(int i)
	{	
		int temp = 0;
		for(int j=2; j<=i; j++){
			
			if(i%j==0){
				temp++;
			}
		}
		if(temp==0)
		{
			System.out.println("number is prime");
		}
		else{
			
			System.out.println("num is not prime");
		}
		
	}
	
	static void checkIsPrime(int i){
		
		if(i==0){
			
			System.out.println("number is 0");
		}
		if(i==1 || i==2){
			
			System.out.println("number is prime");
		}
		int p = 0;
		for(int j=2; j<i; j++){
			
			if(i%j==0){
				p=1;
			}
		}
		
		if(p==0){
			System.out.println("number is prime");
		}
		else
			System.out.println("number is not prime");
		
	}
	
	static int fib(int i){
		
		if(i==0)
			return 0;
		if(i<=2)
			return 1;
		
		int j=fib(i-1)+fib(i-2);
		
		return j;
		
	}

}
