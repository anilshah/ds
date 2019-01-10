package exception;

public class ThrowKeyword {

	
	public static void main(String[] args) throws AgeNotValidException {
		
		Student.disAge(-9);
	}

}
class Student{
	
	static void disAge(int age)throws AgeNotValidException{
		if(age<0){
			throw new AgeNotValidException();
		}else{
			System.out.println("Age "+age);
		}
	}
}
//user defined Exception

class AgeNotValidException extends Exception{
	
	private void AgeNoteValidEx() {
		System.out.println("Age not valid");

	}
}