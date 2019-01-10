package interfaces;

public interface Employee {

	public abstract void getEmpInfo();
	public abstract void getSalInfo();
	
	public static int i=0;
	default void getEmpSalInfo()
	{
		
	}
}

interface Employer{

	public abstract void getEmployer();
	
}

class A implements Employee, Employer{
	
	A(){
		
	}
	public void getEmpInfo()
	{
		
		
	}
	
	public void getSalInfo()
	{
		
	}
	
	public void getEmployer(){
		
		
	}
}

class Test{
	
	public static void main(String[] args){
		
		A a = new A();
		a.getEmpInfo();
		a.getEmpSalInfo();
		
	}
}

interface school{
	
	public static final int i=1;
	
	public abstract void h();
	public static void t(){
		
	}
} 


class b implements school{
	
	public void h(){
		
		
	}
}