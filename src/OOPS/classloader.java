package OOPS;

class generics<U>{
	U response;
	public generics(U res) {
		this.response=res;
	}

	public U res(U u) {
	//	return (U) u.getClass().getName();
		return u;		
	}
	//Compile and run the above code by using the following command:

//javac Demo.java  
//java -verbose:class Demo
	//java Demo
//-verbose:class: It is used to display the information about 
//classes being loaded by JVM. It is useful when using class loader for 
//loading classes dynamically. The following figure shows the output.
	
}
public class classloader {
  public static void main(String[] args) {
	  generics<String> gen=new generics<String>("Chithra");
	  System.out.println(gen.res("hello"));
	  generics<Integer> gen1=new generics<Integer>(12);
	  System.out.println(gen1.res(12));
	  System.out.println(gen.getClass().getName());
	  System.out.println(gen.getClass().getPackage());
	  
  }
}
