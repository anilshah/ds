package pack;

public class SyncronizationEx {

	public static void main(String[] args) {
		A ob = new A();
		new call(ob,"one");
		new call(ob,"two");
		new call(ob,"threa");
		
	}
}
class A{	
	synchronized public void dis(String s){
		System.out.print("["+s);
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("]");
	}
}
class call extends Thread{
	String s ;
	A ob;
	
	call(A ob,String s){
		this.ob = ob;
		this.s = s;
		this.start();
	}

	public void run(){
		ob.dis(s);
	}
}