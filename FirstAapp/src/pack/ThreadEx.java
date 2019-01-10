package pack;

public class ThreadEx {

	public static void main(String[] args) throws InterruptedException {
		
//		Th t = new Th();
//		Thread th = new Thread(t);
//		th.start();
//		System.out.println("main thread");
		
		ThreadByThreadClass t = new ThreadByThreadClass();
		ThreadByThreadClass t1 = new ThreadByThreadClass();
		ThreadByThreadClass t2= new ThreadByThreadClass(); 
		t.start();
		t.join();
		t1.start();
		t2.start();
	}

}
class Th implements Runnable{
	
	public void run(){
		System.out.println("child thread");
	}
}
class ThreadByThreadClass extends Thread{
	
	public void run(){
		for(int i=0; i<5; i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("i:"+i);
		}
	}
}
