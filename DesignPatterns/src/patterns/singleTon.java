package patterns;

public class singleTon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DB o = DB.getInstance();
		System.out.println("obj=="+o);

		DB o2 = DB.getInstance();
		System.out.println("obj=="+o2);
	}

}

class DB{
	
	
	public static DB obj = null;
	
	private DB(){
		
	}
	
	public static DB getInstance(){
		
		if(obj==null){
			obj = new DB();
		}
		return obj;
	}
}
