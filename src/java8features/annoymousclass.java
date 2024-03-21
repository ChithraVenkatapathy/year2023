package java8features;

interface intercom{
	int num=15;
	public void testtest();
	
}
public class annoymousclass {

	public static void main(String[] args) {
		//calling interface using anonymous class
		//interface 
		intercom test=new intercom() {
			@Override
			public void testtest() {
				System.out.println("This is anonymous class calling interface and the number is "+num);
			}
		};
		test.testtest();
		
		//calling Runnable interface using anonymous class
		Runnable run=new Runnable() {			
			@Override
			public void run() {
				System.out.println("executing void thread interface using thread");
				}
		};
		//calling thread class using anonmyous class
		Thread th=new Thread(run);
		th.start();
		System.out.println("Executing thread class using runnable");
		
		Thread thr=new Thread() {
			@Override
			public void run() {
				System.out.println("executing thread class using thread");
			}
		};
		thr.start();
		//calling thread constructor using anonymous class
		System.out.println("Outside Thread method");
		Thread thred=new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Executing thread using constructor class");
				}			
		});
		thred.start();
		System.out.println("outside constructor class");
		
	}

}
