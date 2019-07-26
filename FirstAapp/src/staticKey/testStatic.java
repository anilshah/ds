package staticKey;

import java.util.Scanner;

public class testStatic {

	public static int k = 10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        
        
        int[] a = new int[n];
        for(int j=0; j<n; j++){
        	int val = scan.nextInt();
        	a[j] = val;
        
        }
        scan.close();
        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
        	
            System.out.println(a[i]);
        }
		
		
	}
	
	public static void hello(){
		
		System.out.println("k="+k);
	}

}
