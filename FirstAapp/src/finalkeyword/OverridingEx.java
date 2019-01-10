package finalkeyword;

public class OverridingEx {
	public static void main(String st[]){
		GradeA ob = new GradeA();
		GradeB ob2 = new GradeB();
		
		ob.bonus(5000);
		ob2.bonus(5000);
	}
}
class GradeA{
	
	void bonus(int sal){
		sal = sal+sal*10/100;
		System.out.println(sal);
	}
}

class GradeB extends GradeA{
	
	void bonus(int sal){
		sal = sal+sal*5/100;
		System.out.println(sal);
	}
}
