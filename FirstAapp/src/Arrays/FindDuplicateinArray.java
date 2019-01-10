package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;



public class FindDuplicateinArray {
	
	public static void main(String args[])
	{
		
		duplicateMethod1();
		String[] ar = {"Java", "PHP", "Java", "Python"}; 
		
		//method 1
		for(int i=0; i<ar.length; i++)
		{
			
			for(int j=i+1; j<ar.length; j++)
			{
				
				if(ar[i].equals(ar[j]))
					System.out.println("duplicate");
			}
		}
		
		//method 2
		
		Set<String> s = new HashSet<>();
		for(String s1: ar){
			if(s.add(s1)==false)
			{
				System.out.println("duplicate");
			}
		}
		
		
		Set<String> s2 = new HashSet<>();
		
		for(String ar1: ar)
		{
			if(s2.add(ar1)==false)
			{
				System.out.println("duplicate");
			}
		
		}
		
		String nameArr[]= {"Java", "PHP", "JAVA", "JAVA", "PHP"};
		
		Map<String, Integer> duplName = new HashMap<>();
		for(String s4: nameArr){
			Integer cnt = duplName.get(s4);
			if(null==cnt){
				duplName.put(s4, 1);
			}
			else
				duplName.put(s4, ++cnt);
		}
	}
	
	static void duplicateMethod1()
	{
		String names[] = {"anil", "sunil", "anil"};
		
		//using hash set
		
		Set<String> s = new HashSet<>();
		for(String s2: names){
			
			if(s.add(s2)){
				System.out.println("it's not duplicate =="+s2);
			}
			else
				System.out.println("it's duplicate=="+s2);
		}
		
		
		//using HashMap
		
		Map<String, Integer> st = new HashMap<>();
		
		for(String s2: names){
			
			Integer count = st.get(s2);
			if(null==count)
				st.put(s2, 1);
			else
				st.put(s2, ++count);
		}
		
		
		String str="shbdjvjs541526@#$$%%^ADSS";
		
		str = str.replaceAll("[^a-zA-Z!#$]", "");
		
		System.out.println("updated str=="+str);
	}

}
