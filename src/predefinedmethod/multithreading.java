package predefinedmethod;
import java.lang.Thread;


class multithread extends Thread{
	int print=0;
	multithread(int a){
		print=a;
	}
@Override
public void run() {
	
	try {
		Thread.sleep(100);
		 for(int a=0;a<=print;a++) {
				System.out.println(Thread.currentThread().getId()+" "+a);
				System.out.println(Thread.currentThread().getName()+" "+a);
				System.out.println(Thread.currentThread().getClass()+" "+a);
			}
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
public void print(int b) {
	for(int a=0;a<=b;a++) {
		System.out.println(Thread.currentThread().getId()+" "+a);
		System.out.println(Thread.currentThread().getName()+" "+a);
		System.out.println(Thread.currentThread().getClass()+" "+a);
	}
	
}
}
 
 class multiple implements Runnable{
	 int print;
	 multiple(int c){
		 print=c;
	 }
	 @Override
	 public void run() {
		 try {
			Thread.sleep(100);
			 for(int a=0;a<=print;a++) {
					System.out.println(Thread.currentThread().getId()+" "+a);
					System.out.println(Thread.currentThread().getName()+" "+a);
					System.out.println(Thread.currentThread().getClass()+" "+a);
				}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 
	 public void print(int b) {
		
	 }
 }
 
 public class multithreading {
	 public static void main(String[] args ) {
		 for (int i=0;i<=5;i++) {
			 multithread multi=new multithread(i);
			 //.start() correct way to start a thread
			 multi.start();
			// multi.print(5);
			 //new multiple(i)//initalizing thread Runnable class
			 Thread th=new Thread(new multiple(i));
			 th.start();
			  
		 }
		
	 }
 }
