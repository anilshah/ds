package linkedin;

public class Palindrome {
	
	public static void main(String[] args) {
		checkPalindrome("551");
		
	}
		
	
	static void checkPalindrome(String originalStr){
		
		String reverseStr = "";
		
		if(null!=originalStr){
			
			for(int i=originalStr.length()-1; i>=0; i--){
				
				reverseStr = reverseStr + originalStr.charAt(i);
			}
			
			if(originalStr.equals(reverseStr)){
				System.out.println("str is palindrome");
			}
			else{
				
				System.out.println("str is not palindrome");
			}
			
		}
		
	}

}
