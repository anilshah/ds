package collection;

import java.util.PriorityQueue;

public class QueueEx {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> q = new PriorityQueue<>();
		q.add(4);
		q.add(5);
		q.add(12);
		/*System.out.println(q);
		System.out.println(q.remove());
		System.out.println(q.poll());
		System.out.println(q.peek());
		System.out.println(q.element());
		*/
		myQueue mq = new myQueue();
		
		String s = mq.setMyQueue();
		System.out.println(s);
	}
}
class myQueue {
	
	String setMyQueue(){
		String ss = "m,sdn";
		
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("Anil");
		pq.add("Sunil");
		ss = pq.peek();
		return ss;
		
	}
}
