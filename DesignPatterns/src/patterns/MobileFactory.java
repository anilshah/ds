package patterns;

public class MobileFactory {

	public Mobile getMobile(String s)
	{
		if(s.equals("iphone"))
			return new Iphone();
		else
			return new Iphone();
					
		
	}
}
