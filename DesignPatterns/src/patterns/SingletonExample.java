package patterns;


 class SingletonExample {
	
	private static final SingletonExample myobj = new SingletonExample();
	private SingletonExample()
	{
		
		
	}
	
	public static SingletonExample getInstance()
	{
		
		return myobj;
	}
	
	void check(){
		
		System.out.println("1");
	}
	
	void check2(){
		
		System.out.println(2);
	}

}


class Test{
	
	public static void main(String[] args){
		
		SingletonExample obj = SingletonExample.getInstance() ;
		obj.check();
		
		System.out.println("sigleton object");
	}
}


