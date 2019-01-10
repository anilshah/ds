package leetcode;

import java.util.Stack;

public class QueueWith2Stack {
	
	//Queue 1,3,6,4,8
	//FIFO
	
	//Create 2 stacks
	Stack<Integer> s1 = new Stack<>();
	Stack<Integer> s2 = new Stack<>();
	
	//Enqueue an element
	void enqueueElement(Integer ele){
		s1.push(ele);
	}
	
	//Enqueue an element
		Integer dequeueElement(){
			
			if(s1.isEmpty() && s2.isEmpty())
				return 0;
			
			while(s1.size()>0){
				
				s2.push(s1.pop());
			}
			return s2.pop();
		}

}
