package finalkeyword;

public class InterfaceEx {

	public static void main(String[] args) {
		System.out.println(I1.x);
		x ob = new x();
		//ob.x++;
	}

}
interface I1 {
	int x = 89;
	abstract void dis();
	/*void d(){
		
	}*/
}
interface I2{
	int x = 23;
	void dis();
}
class Y{
	void disY(){}
}
class x extends Y implements I1,I2{

	
	public void dis() {
		
		
	}

	
	public void dis2() {
		
		
	}
	
}