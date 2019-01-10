package string;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;

public class stringEx {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("a");
		sb = sb.append("H");
		sb.append("b");
		System.out.println(sb);
		
		reverse("hello");
	}

	public static String reverse(String s)
	{
		//Using String Builder
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		
		
		
		String reverseString = sb.toString();
		
		System.out.println("reverse using stringBuilder=="+reverseString);
		
		//Using charArray
		
		char ch[] = s.toCharArray();
		String rev = "";
		if(null!=s){
			
			for(int i=s.length()-1; i>=0; i--){
				
				rev+=ch[i];
				
			}
		}
		
		System.out.println("reverse String using charArr=="+rev);
		
		return reverseString;
	}
}
//String Builder
//String Buffer