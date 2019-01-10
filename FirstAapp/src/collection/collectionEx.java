package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/*public class collectionEx {

	public static void main(String[] args) {
		
		Gen<Integer> g = new Gen<>();
		int a = g.getObj(8);
		
		ArrayList<Integer> ar = new ArrayList<>();
		//ArrayList ar = new ArrayList();
		ar.add(8);
		ar.add(99);
		ar.add(12);
		ar.add(1, 34);
		int x = (Integer)ar.get(0);
		System.out.println(ar);
	}

}*/

class collection2{
	
	String hello(String t)
	{
		ArrayList<String> as = new ArrayList<>();
		as.add("hi");
		as.add("I am");
		String x = as.get(0);
		Iterator<String> it = as.listIterator();
		
		while(it.hasNext()){
			
			System.out.println(it.next());
		}
		
		//System.out.println(x);	
		return t;
		
	}
}

public class collectionEx {

	public static void main(String[] args) {
		
		/*Gen<Integer> g = new Gen<>();
		int a = g.getObj(8);*/
		
		//checkPalindrome("momy");
		collection2 c2 = new collection2();
		System.out.println("jhagdja=="+c2.hello("s"));
		
		LinkedList<Integer> ar = new LinkedList<>();
		//ArrayList ar = new ArrayList();
		ar.add(8);
		ar.add(99);
		ar.add(12);
		ar.add(3,34);
		//int x = (Integer)ar.get(0);
		//Iterator<Integer> itr = ar.iterator();
		ListIterator<Integer> itr = ar.listIterator();
		itr.next();
		System.out.println(itr.previous());
		/*while(itr.hasNext()){
			System.out.println(itr.next());
		}*/
		
		
	}
	
	public static void checkPalindrome(String s)
	{
		StringBuilder sb = new StringBuilder(s);
		String reverse = sb.reverse().toString();
		
		System.out.println("string=="+s+"==palindrome=="+reverse);
		if(null!=s){
			
			if(s.equalsIgnoreCase(reverse)){
				System.out.println("string is palindrome");
				
			}
			else
			{
				System.out.println("string is not palindrome");
			}
		}
		
	}

}

class Gen<T>{
	
	T getObj(T o){
		return o;
	}
}
