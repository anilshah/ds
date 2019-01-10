package leetcode;

/**
Given a list of daily temperatures T, return a list such that, for each day in the input, 
tells you how many days you would have to wait until a warmer temperature. 
If there is no future day for which this is possible, put 0 instead.

For example, given the list of temperatures T = [73, 74, 75, 71, 69, 72, 76, 73], 
your output should be [1, 1, 4, 2, 1, 1, 0, 0].

Note: The length of temperatures will be in the range [1, 30000]. 
Each temperature will be an integer in the range [30, 100].

*/

public class DailyTemperature {
	
	void findDays1(){
		
		int[] temps = new int[10];
		temps[0] = 73;
		temps[1] = 74;
		temps[2] = 75;
		temps[3] = 71;
		temps[4] = 69;
		temps[5] = 72;
		temps[6] = 76;
		temps[7] = 73;
		int counter = 0;
		for(int i=0; i<temps.length; i++){
			
			for(int j=i+1; j<temps.length; j++){
				
				if(temps[i]<temps[j]){
					
					
					System.out.println("num=="+counter);
					counter=0;
				}
				counter++;
			}
			
		}
		
	}

}
