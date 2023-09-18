package kr.co.himedia.thread02;

class PriorityThread extends Thread{
	
	public void run() {
		int sum = 0;
		
		Thread thread = Thread.currentThread();
		System.out.println(thread + " start");
		for(int i=0; i<1000000; i++)
			sum += i;
		
		System.out.println(thread.getPriority()+ " end");
	}
}

public class PriorityTest {
	
	public static void main(String[] args) {
		 
		int i;
		for (i=Thread.MIN_PRIORITY; i<=Thread.MAX_PRIORITY; i++) { //MIN_PRIORITY 은 1 , MAX_PRIORITY 은 10 -> i는 1이고 10과 같거나 작음. 그 동안 반복
			PriorityThread pt = new PriorityThread();
			pt.setPriority(i);
			pt.start();
		}
	}
	
}


