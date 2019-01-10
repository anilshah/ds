package patterns;

public class TestPatterns {
	
	public static void main(String args[]){
		
		checkSingleton();
		
		
	}
	
	
	public static void checkSingleton()
	{
		
		SingletonExample s1 = SingletonExample.getInstance();
		SingletonExample s2 = SingletonExample.getInstance();
		
		System.out.println("s1=="+s1+"==s2="+s2);
	}
	
	

}
