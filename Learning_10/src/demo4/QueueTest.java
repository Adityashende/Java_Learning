package demo4;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> q1=new ArrayBlockingQueue<Integer>(3);
		
		q1.add(10);
		q1.add(4);
		q1.add(5);
		
		System.out.println("Head of the queue is: "+q1.element());
		try {
			q1.add(14);
		} catch (IllegalStateException e) {
			// TODO: handle exception
			System.out.println("Out of Bound");
		}
		for(Integer value:q1) {
			System.out.println(value);
		}
		Integer value = q1.remove();
		System.out.println("Value removed is: "+value);
	}

}
