package leetcode;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class StackUsing2Queue {
	
	//https://leetcode.com/articles/implement-stack-using-queues/
	private Queue<Integer> q1 = new LinkedList<>();
	private Queue<Integer> q2 = new LinkedList<>();
	private int top;
	
	void push(Integer ele){
		
		q1.add(ele);
		top = ele;
	}
	
	void pop(){
		
		while(q1.size()>1){
			top=q1.remove();
			q2.add(top);
		}
		q1.remove();
		
	}

}
