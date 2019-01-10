package pack;

public class Lcm {
	
	public static void main(String[] args)
	{
		int a=2, b=3, lcmval=3;
		//int divval = 0;
		//divval=a%lcmval;
		//System.out.println("divval=="+divval);
		while(true){
			
			if(lcmval%a==0)
			{
				if(lcmval%b==0){
					System.out.println("the lcm is "+lcmval);
					break;
				}
			}
			lcmval++;
		}
		
		
	}

}
