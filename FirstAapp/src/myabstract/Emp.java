package myabstract;

abstract class Emp {
	
	void getEmpInfo(){
		
	}
	
	public abstract void getSalInfo();

}

abstract class Employer{
	
	public abstract void getEmployerName();
	
	public void getAllFunds(){
		
		
	}
}

class A extends Emp{
	
	A()
	{
		System.out.println("class A");
	}
	public void getSalInfo()
	{
		
	}
}

class B extends A{
	
	B(){
		//super();
		super.getEmpInfo();
	}
}

class test{
	
	public static void main(String a[])
	{
		
		B objb = new B();
		
	}
}

//java automatically calls super keyword in first line of constructor
//super access the immediate parent class constructor and methods
