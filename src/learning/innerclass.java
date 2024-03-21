package learning;

public class innerclass {
int res=5;
public void response() {
	class inner{
		public int divisior(int divisior) {
			return divisior;
			
		}
		public int sum(int divisior,int sum) {
			return divisior/sum;
		}
		
	}
	
	
	class nextinner{
		public void print(int value) {
			System.out.println("Printing the value "+value);
		}
	}
	inner innn=new inner();
	System.out.println(innn.divisior(5));
	System.out.println(innn.sum(5, 5));
	nextinner next=new nextinner();
	next.print(5);
}
	
	public static void main(String[] args) {
		innerclass inner11=new innerclass();
		//inner.res=10;
		
		inner11.response();
		
		

	}

}
