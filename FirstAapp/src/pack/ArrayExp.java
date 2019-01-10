package pack;

public class ArrayExp {
//1 Dimensional Array
	/*public static void main(String[] args) {
		int ar[] = {2,4,5,7,3,9};
		System.out.println("arr length="+ar.length);
		
		for(int i=0; i<ar.length; i++)
		{	
			System.out.println("arrVal=="+ar[i]);
		}

	}*/
	
	//2 Dimensional Array
	/*public static void main(String[] args) {
		int ar[][] = {{2,4,5},{7,3,9}};
		System.out.println("arr length="+ar.length);
		System.out.println("arr length="+ar[0].length);
		
		for(int i=0; i<ar.length; i++)
		{	
			for(int j=0; j<ar[i].length; j++)
			{
				System.out.print(ar[i][j]);
			}
			System.out.println();
		}
	}
	*/
	
	//Program to print no. of occurrence of same number
	public static void main(String[] args) {
		int ar[] = {9,2,9,3,5,9,1};
		System.out.println("arr length="+ar.length);
		
		for(int i=0; i<ar.length; i++)
		{	
			int f=0;
			for(int k=0; k<i; k++)
			{
				if(i!=k){
				if(ar[i]==ar[k])
					f=1;
				}
			}
			if(f==0){
			int occ = 1;
			for(int j=1; j<(ar.length)-1; j++){
				if(ar[i]==ar[j]){
					occ++;
				}
			}
			System.out.println("occurrence of "+ar[i]+" = "+occ);
		}
		}
	}
}
