package learning;
class learn{
	public void learn() {
		System.out.println("learning");
	}
}
class expect extends learn{
	public String expect() {
		return "hello";
	}
}
class classNotFound {
	
	public static void main(String param []) {
	
		expect ex=new expect();
		System.out.println(ex.expect());
		ex.learn();
	}

}
