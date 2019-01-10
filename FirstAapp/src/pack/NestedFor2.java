package pack;

public class NestedFor2 {

	/*public static void main(String[] args) {
		for(int i=1; i<5; i++)
		{	
			for(int j=i; j>=1; j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}*/
	
	/*public static void main(String[] args) {
		for(int i=1; i<5; i++)
		{	
			for(int j=i; j>=1; j--)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}*/
	
	/*public static void main(String[] args) {
		for(int i=5; i>1; i--)
		{	
			//System.out.print(i+" ");
			for(int j=1; j<i; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}*/
	
	/*public static void main(String[] args) {
		for(int i=1; i<4; i++)
		{	
			//System.out.print(i+" ");
			for(int j=1; j<=i; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}*/
	
	/*
	 * For output
	123454321
	1234 4321
	123   321
	12     21
	1       1
	 */
	
	public static void main(String[] args) {
		for(int i=5; i>=1; i--)
		{	
			
				for(int j=1; j<=i; j++)
				{
					System.out.print(j+"");
				}
				if(i<5){
				for(int k=1; k<=5-i; k++)
				{
					System.out.print(" ");
				}
				}
				
				if(i<4)
				{	
					for(int k=1; k<=4-i; k++)
					{
						System.out.print(" ");
					}
				}
				for(int l=i; l>0; l--)
				{
					if(l!=5)
					System.out.print(l+"");
				}
				
				System.out.println();
		}
		
				
			
		}
	}


