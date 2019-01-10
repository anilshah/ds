package ds;

public class Strings {
	
	public static void main(String[] args){
		
		
		String s = "this is good";
		//good is this - reverse the sentence
		String rev = "";
		for(int i=s.length()-1; i>=0; i--){
			
			rev = rev + s.charAt(i);
			
		}
		
		System.out.println("rev=="+rev);
		
		//using StringBuilder
		
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		
		rev = sb.toString();
		System.out.println("rev=="+rev);
		
		//using stringbuffer
		
	}

}
