package pack;
import java.util.Scanner;

public class SwithcEX {

	/*public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		
		switch(a){
			case 2:
				System.out.println("java");
				break;
			case 3:
				System.out.println("Android");
				break;
				
			default:
				System.out.println("wrong entry");
				
		}

	}
	*/
	
	public static void main(String[] args){
		
	Student2 s2 = new Student2();
	String outp;
	s2.checkscore(3);
	}

}

class Student2{
	
	void checkscore(int i)
	{
		switch(i){
		
		case 2:
			System.out.println("print 2");
			break;
		
		case 3:
			System.out.println("print 3");
			break;
			
			default:
				System.out.println("print default");
				break;
		}
		
		
	}
}
