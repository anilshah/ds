package ds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//revStr("anil");
		//arrCount();
		maxDiff();
		maxDiff2();
	}
	
	//max diff 2 numbers
	
	static void maxDiff(){
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(900);
		al.add(350);
		al.add(650);
		al.add(100);
		al.add(750);
		al.add(550);
		
		int maxDiff = 0;
		int key1 = 0;
		int key2 = 0;
		for(int i=0; i<al.size(); i++){
			
			for(int j=i+1;j<al.size(); j++){
				int diff = al.get(j)-al.get(i);
				if(diff>maxDiff){
					maxDiff = diff;
					key1 = al.get(i);
					key2 = al.get(j);
				}
			}
		}
		
		System.out.println("maxDiff=="+maxDiff+"=key1="+key1+"=key2="+key2);
		
	}
	
	static void maxDiff2()
	{
		int arr[] = {900, 350, 650, 100, 750, 550};
		int sz = arr.length;
		int maxDiff=0, key1=0, minNum=arr[0], key2=0;
		for(int i=0; i<sz; i++){
			
			if(arr[i]-minNum > maxDiff){
				maxDiff = arr[i]-minNum;
				key1 = arr[i];
				key2 = minNum;
			}
			if(arr[i]<minNum){
				minNum=arr[i];
			}
		}
		
		System.out.println("maxDiff="+maxDiff+"=key1="+key2+"=key2="+key1);
		
	}
	
	
	static void revStr(String str){
		
		String rev = "";
		if(str!=""){
			
			for(int i=str.length()-1; i>=0; i--){
				rev = rev + str.charAt(i);
				
			}
			
			System.out.println("revStr=="+rev);
		}
	}
	
	static void arrCount(){
		
		ArrayList<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(1);
		a.add(6);
		a.add(2);
		a.add(1);
	
		Map<Integer, Integer> hm = new HashMap<>();
		for(int i=0; i<a.size(); i++){
			
			int key = a.get(i);
			//System.out.println(hm.containsKey(key));
			
			if(hm.containsKey(key)){
				int val = hm.get(key);
				hm.put(key, val+1);
			}
			else
			{
				hm.put(key, 1);
			}
		}
		
		System.out.println(hm);
		
	}

}
