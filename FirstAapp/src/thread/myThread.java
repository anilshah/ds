package thread;

public class myThread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		customThread t1 = new customThread(1);
		//customThread t2 = new customThread(2);
		
		t1.setPriority(1);
		//t2.setPriority(10);
		
	//	t1.setDaemon(true);
		
		t1.start();
		//t1.interrupt();
		System.out.println(t1.isAlive());
		//System.out.println(t1.getId());
		
		//t1.suspend();
	
		t1.join();
		//t2.start();
		
		
		/*th t3 = new th();
		Thread th1 = new Thread(t3);
		th1.start();*/
	}
}

class th implements Runnable{
	
	public void run(){
		System.out.println("I am in");
		
	}
}

class customThread extends Thread{

	int s = 0;
	customThread(int d){
		
		s= d;
		
	}
	public void run()
	{
		int i = 0;
		int j = 0;
		
		if(s==1)
		{	
			System.out.println("thread 1");
		}
		else
		{	
			System.out.println("thread 2");
		}
		
		System.out.println("thread name=="+Thread.currentThread().getName());
		System.out.println("thread priority=="+Thread.currentThread().getPriority());
		
		for(i=0; i<5; i++){
			try {
				Thread.sleep(1000);
				//if(i==2)
					
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("i=="+i);
		}
		
	}
	
}
