package predefinedmethod;

//generics
class A<T>{//type safety
	T obj;
	//must have a constructor
	A(T obj){
		this.obj=obj;
	}
	public T main() {
		return obj;
	}
}

public class generics {
	//<U> must need to give  
	public <C> void res(C ele) {		
		System.out.println(ele.getClass().getName()+" ="+ele );
	}
	
	public static void main(String[] args) {
		A<String> a=new A<>("chithra");
		System.out.println(a.main());
		A<Integer> b=new A<>(12);
		System.out.println(b.main());
		A<Float> c=new A<Float>(12.23f);
		System.out.println(c.main());
		generics gen=new generics();
		gen.res("hello");
		gen.res(12);
	}


}
