package learning;

class  synchroniz{
	
	 public synchronized void threadclass(int n) throws InterruptedException{
		for (int i = 0; i < 5; i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(100);
			}catch(Exception ex) {
				
			}
						
		}
	}
}

class synchom extends Thread{
	
	synchroniz syn;
	synchom(synchroniz sync){
		this.syn=sync;		
	}
	
	public void run() {
		try {
			syn.threadclass(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

class second extends Thread{
	synchroniz syn;
	second(synchroniz syn){
		this.syn=syn;
	}
	public void run() {
		try {
			syn.threadclass(25);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


public class synchronization{
	public static void main(String[] args) throws InterruptedException {
	
		final synchroniz syn=new synchroniz();
		synchom synch=new synchom(syn);
		second sec=new second(syn);
		synch.start();
		synch.join();
		sec.start();
		sec.join();
		
		Thread th=new Thread() {
			@Override			
			public void run() {
				try {
					syn.threadclass(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
			
		};
		
		Runnable rn=new Runnable() {
			
			@Override
			public void run() {
				try {
					syn.threadclass(20);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		};
		Thread thr=new Thread(rn);
		
		
		Thread thread=new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					syn.threadclass(5);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		th.start();
		
		th.join();
		thr.start();
		thr.join();
		thread.start();
		thread.join();
	}

}
