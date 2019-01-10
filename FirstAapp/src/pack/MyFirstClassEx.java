package pack;


public class MyFirstClassEx {
	static int a=90;
	public static void main(String st[]){
		/*Student s1;
		s1 = new Student();
		s1.marks=2;
		s1.subject="Maths";
		System.out.println("marks="+s1.marks+"=subject=="+s1.subject);
		System.out.println(a);*/
		
		TestMarks t = new TestMarks();
		TestMarks t2 = new TestMarks();
		int c = t.add(4, 5);
		
		getResult gm = new getResult();
		System.out.println("marks percentage=="+gm.avgMarks());
		
		
	}
}
class Student{
	
	int marks;
	String subject;
}

class TestMarks{
	static int x=9;
	static{
		System.out.println("this static block");
	}
	TestMarks() {
		System.out.println("constructor");
	}
	
	int add(int x,int y){
		return x+y;
	}
	
	
	static void dis(){
		System.out.println(x);
	}
	
}

class getResult{
	
	double avgMarks()
	{
		double totalmarks= 500.0;
		double aggMarks = 400.0;
		
		double per = (aggMarks/totalmarks)*100;
		return per;
	}
}


