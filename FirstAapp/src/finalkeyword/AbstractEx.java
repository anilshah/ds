package finalkeyword;

public class AbstractEx {

	public static void main(String[] args) {
		Emp e =new GradeAa();
	}

}
abstract class Emp{
	abstract void bonus(int sal);
	
	void dis(){
		System.out.println("Non abstract");
	}
}
class GradeAa extends Emp{
	
	void bonus(int sal){
		sal = sal+sal*10/100;
		System.out.println(sal);
	}
}

class GradeBb extends Emp{
	
	void bonus(int sal){
		sal = sal+sal*5/100;
		System.out.println(sal);
	}
}
