package linkedin;

public class Test {

	
	public static void main(String[] args){
		
	/*int[] ar = new int[3];	
	ar[0] = 1;
	ar[1] = 2;
	ar[2] = 'd';
	
	System.out.println("arr=="+ar[2]);*/
		Student s = new Student();
		if(s.checkPalindrome("hello"))
		{
			
			System.out.println("it's plaindrome");
		}
		else
		{
			
			System.out.println("it's not plaindrome");
		}
		
	}
	
	
	
}

class Student{
	
	String name;
	String email;
	int phone;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	Boolean checkPalindrome(String n){
		
		String rev = "";
		for(int i=n.length()-1; i>=0; i--){
			rev=rev + n.charAt(i);	
		}
		if(n.equals(rev)){
			System.out.println("str is palindrome");
		return true;
		}
		else
		{
			System.out.println("str is not palindrome");
			return false;
		}
		
		
	}
	
	
	
}
