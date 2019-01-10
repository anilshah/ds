package Arrays;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateUsingHashMap {
	
	
public static void main(String a[]){
		
	test obj = new test();
	
	System.out.println("hello");
		obj.findDup();
	}

	void getDupl()
	{
		String ar[] = {"java", "php", "c", "java"};
		Map<String, Integer> duplArr = new HashMap<>();
		for(String ar1: ar){
			Integer cnt = duplArr.get(ar1);
			if(cnt==null)
				duplArr.put(ar1, 0);
			else
				duplArr.put(ar1, ++cnt);
		}
		
		
	}
	

}

class test{
	
	
	
	 void findDup(){
		String ar[] = {"java", "php", "c", "java"};
		
		for (int i=0; i<ar.length; i++){
			
			for(int j=i+1; j<ar.length; j++)
			{
				if(ar[i].equalsIgnoreCase(ar[j])){
					
					System.out.println("dupicate found=="+ar[i]);
				}
				
			}
			
		}
		}
}


