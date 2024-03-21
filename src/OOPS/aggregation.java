package OOPS;

class aggreate{
	int id;
	String name;
	int phoneno;
	//aggreate agg;
	//must have constrctor
	public aggreate (int id,String name,int phoneno) {
		this.id=id;
		this.name=name;
		this.phoneno=phoneno;
		
	}
}
//if a class a entity relationship is known as aggregation
//aggregation means two classes have no is-A relationship 
//has-A relationship
public class aggregation {
	//this is aggreation aggreate agg
	public static void res(aggreate agg) {
		System.out.println("the details are "+agg.id+agg.name+agg.phoneno);
	}
	
	public static void main(String args[]) {
		try {
			aggreate agg=new aggreate(12," chithra ",34567890);
			res(agg);
			aggreate agg1=new aggreate(13," chithra ",34567890);
			res(agg1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	//	System.out.println(a);
	}
	

}
