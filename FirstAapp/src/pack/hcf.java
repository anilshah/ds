package pack;

public class hcf {
	
	public static void main (String[] args){
		
		int a=9, b=12, rem=1;
		
		while(true){
			rem = b%a;
			
			if(rem==0)
			{	
				System.out.println("the hcf is "+a);
					break;
			}
			else
			{
				b=a;
				a=rem;
				
			}
			}
			
		}
	}


