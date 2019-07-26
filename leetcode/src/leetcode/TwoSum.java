package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	int[] checkTwoSumMethod1(int[] Arr, int num ){
		
		int[] result = new int[2];
		//1,3,2,4,50
		if(Arr == null || Arr.length==0){
			return result;
		}
		for(int i=0; i<Arr.length; i++){
			
			for(int j=i+1; j<Arr.length; j++){
				
				if(Arr[i]+Arr[j]==num){
					
					result[0]=i;
					result[1]=j;
					System.out.println("i=="+i+"=j=="+j);
					return result;
				}
			}
		}
		 
		return Arr;
	}
	
int[] checkTwoSumMethod2(int[] Arr, int num ){
		
		int[] result = new int[2];
		//1,3,2,4,50
		if(Arr == null || Arr.length==0){
			return result;
		}
		Map<Integer, Integer> mp = new HashMap<>();
		
		for(int i=0; i<Arr.length; i++){
			
			if(mp.containsKey(num-Arr[i])){
				result[1] = mp.get(num-Arr[i]);
				result[0] = i;
				System.out.println("inside i=="+result[0]+"=j=="+result[1]);
			}
			else
			{
				mp.put(Arr[i], i);
			}
		}
		
		return result;
	}

}
