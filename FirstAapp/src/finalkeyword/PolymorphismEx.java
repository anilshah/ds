package finalkeyword;

public class PolymorphismEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class cal{
	void dis(){
		System.out.println("no args");
	}
	void dis(int x){
		System.out.println("int");
	}
	void dis(int x,int y){
		System.out.println("int and int");
	}
	void dis(int x,float y){
		System.out.println("int and float");
	}
	void dis(float x,int y){
		System.out.println("float and int");
	}
}
