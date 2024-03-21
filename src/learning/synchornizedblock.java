package learning;

class aa{
	public void syn(String str) throws InterruptedException {
		synchronized (this) {
			System.out.println("Started "+str);
			for (int i = 0; i <=5; i++) {
				Thread.sleep(200);
			}
			System.out.println("ended "+str);
		}
	}
}
class bb extends Thread{
	aa aa;
	bb(aa aa){
		this.aa=aa;
	}
	public void run() {
		try {
			aa.syn("Java");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class cc extends Thread{
	aa aa;
	cc(aa aa){
		this.aa=aa;
	}
	public void run() {
		try {
			aa.syn("springMVC");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class synchornizedblock {

	public static void main(String[] args) throws InterruptedException {
		final aa aa=new aa();
		bb bb=new bb(aa);
		cc cc=new cc(aa);
		bb.start();
		cc.start();
//		try {
////			bb.join();
////			cc.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		Runnable rn=new Runnable() {
			
			@Override
			public void run() {
				try {
					aa.syn("thread started");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		};
		Thread th=new Thread(rn);
		th.start();
		th.join();
	}

}
