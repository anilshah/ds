package ds;

import java.util.Scanner;

public class Fibonacci {
	
	int f = 1, res;
	public static void main(String[] args){
		
		/**
		 * 
		 * Fibonacci example
		 * */
		int j = 7;
		
		for(int i=0; i<=j; i++){
			//System.out.println("series=="+generateFib(i));
		}
		int i =0;
		while(i<8){
			System.out.println("series=="+generateFib(i));
			i++;
		}
		
		
		//Factorial example
		/**
		Scanner kb = new Scanner(System.in);
		
		System.out.println("input key");
		int k = kb.nextInt();
		
		int f = 1;
		while(k!=0){
			f = f*k;
			k--;
		}
		
		System.out.println("fact by while loop =="+f);
		
		**/
		
		// factorial example by recursion
		/**
		Fibonacci fb = new Fibonacci();
		int res = fb.generateFact(4);
		
		System.out.println("fact by recursion=="+res);
		**/
		
	}
	
	
	
	public static int generateFib(int s){
		
		if(s==0)
			return 0;
		
		if(s<=2)
			return 1;
		
		int val = generateFib(s-1) + generateFib(s-2);
		return val;
	}
	
	public int generateFact(int val){
		
		
		if(val>1)
		{
			f = f*val;
			generateFact(val-1);
			
		}
		
		return f;
			
	}

}
