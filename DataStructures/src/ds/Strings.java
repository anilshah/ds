package ds;

import java.util.ArrayList;
import java.util.Arrays;


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
		int arr[] = {2, 5, 1};
		abc(arr);
		
	}
	
	static void abc(int a[]){
		int len = a.length;
		
		
		String abc = "mystr";
		String revSt = "";
		for(int i=abc.length()-1; i>=0; i--){
			
			revSt += abc.charAt(i);
		}
		System.out.println("rev="+revSt);
		if(len>0)
		{
			Arrays.sort(a);
			int pre = a[0];
			for(int i=1; i<a.length-1; i++){
				if(a[i]==pre){
					
				}
				pre = a[i];
				
			}
		}
		else
		{
			System.out.println("array is empty");
		}
	}

}
