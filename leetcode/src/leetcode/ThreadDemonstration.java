package leetcode;

public class ThreadDemonstration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		simpleVsMultipleThreads.example();

	}
}

class simpleVsMultipleThreads{
	
	
	public static void example() throws InterruptedException{
		
		int sumTo = 250;
		long[] halfSums = new long[2];
		
		Thread single = new Thread(new Runnable(){
			
			public void run(){
				
				long ss = 0;
				for(int i=0; i<sumTo; i++){
					ss += i+1;
				}
				
				System.out.println("single sum result=="+ss);
			}
		});
		
		long s1 = System.currentTimeMillis();
		single.start();
		single.join();
		
		System.out.println("time taken=="+ (System.currentTimeMillis() - s1));
		
		
		//sum using multiple threads
		Thread h1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				long hs = 0;
				for(int i=0; i<sumTo/2;i++){
					hs +=i+1;
				}
				halfSums[0] = hs;
				System.out.println("half sum1 = "+hs);
				
			}
		});
		
		Thread h2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				long hs2 = 0;
				for(int i=sumTo/2; i<sumTo;i++){
					hs2 +=i+1;
				}
				halfSums[1] = hs2;
				System.out.println("half Sum2 = "+ hs2);
				
			}
		});
		
		s1 = System.currentTimeMillis();
		h1.start();
		h2.start();
		
		h1.join();
		h2.join();
		
		System.out.println("time taken for 2 threads = "+ (System.currentTimeMillis() - s1));
		System.out.println("sum="+ (halfSums[0]+halfSums[1]));
	}
}