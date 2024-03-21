package learning;

class syn{
	public synchronized static void threadprint(String res) {
		System.out.println("sending "+res);
		for (int i = 0; i <= 5; i++) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(res +" sent");
	}
}
class As extends Thread{
	
	public void run() {
		syn.threadprint("hello");
	}
}

class Bs extends Thread{
	public void run() {
		syn.threadprint("welcome");
	}
}

public class staticsynchronized {

	public static void main(String[] args) throws InterruptedException {
	//	final syn sy=new syn();
		As a=new As();
		a.start();
		a.join();
		Bs b=new Bs();
		b.start();
		b.join();
		Thread th=new Thread() {
			@Override
			public void run() {
				syn.threadprint("java");
			}
		};
		th.start();
		th.join();
		Thread threaad=new Thread(new Runnable() {
			
			@Override
			public void run() {
				syn.threadprint("spring boot");
				
			}
		});
		
		threaad.start();
		threaad.join();
		
		
		

	}

}
