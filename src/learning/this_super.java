package learning;
class thisexample{
	int c;
	int d;
	thisexample(Integer a,Integer b ){
		this.c=a;
		this.d=b;
		System.out.println("C= "+c+" and "+"D="+d);
	}
	public int run(int a,int b) {
		this.c=a;
		this.d=b;
		return c+d;
	}
}
class extendin{
	int a=10;
	public static String rep="res";
	public String res(String res) {
		return res=res.concat(res);
	}
}
public class this_super extends extendin {
	public void resp(){
		super.a=5;
		super.rep="hello";
		System.out.println(super.a);
		System.out.println(super.res("chithra"));
		System.out.println(super.rep);
	}
	public static void main(String args []) {
		thisexample this_ex=new thisexample(34, 35);
		System.out.println(this_ex.run(35, 45));
		this_super thissup=new this_super();
		thissup.resp();
	}
	
	

}
