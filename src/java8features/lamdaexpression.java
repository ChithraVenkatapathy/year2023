package java8features;
//lamda expression will provide implementation of functional interface
//code simplecity

@FunctionalInterface
interface lamda{
	public void say();	
}

@FunctionalInterface
interface nextlamda{
	public String next(String name);
}

@FunctionalInterface
interface lamda3{
	public void lamda3(String tem,String name);
}
public class lamdaexpression {
	
	public static void main(String args[]) throws InterruptedException {
		System.out.println("lamda expression");
		lamda l=()->{
			System.out.println("hello");
		};
		
		l.say();
		nextlamda nex=(name)->{
			return name;
		};
		
		String res=nex.next("hello chithra");
		System.out.println(res);
		lamda3 l3=(tem,name)->{
			System.out.println(tem+name);
		};
		
		l3.lamda3("hello", " lamda expressions");
		Runnable r1=()->{
			System.out.println("Thread is running");
		};
		//correct way to start a thread is .start()
		Thread t1=new Thread();
		t1.start();
		r1.wait(12);
//		try {
//			//t1.wait(15);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		t1.stop();
			
	}

}
