package predefinedmethod;

public class wrapperclass {
	int inobj;
	char chobj='a';
	double dbobj=23.4D;
	float fobj=2.3f;	
	boolean bobj=true;	
	//primitive to object and object to primitive
	//autoboxing and unboxing
	//Collections use only Object
	wrapperclass(Integer in,Character c,Float f){
		this.inobj=in;
		this.chobj=c;
		this.fobj=f;
		System.out.println(inobj+" "+chobj+" "+fobj);
	}
	
	public void res(Integer inpri,Character chpri,Double dbpri,Float flpri,
			Boolean blpri) {
		this.inobj=inpri;
		
		this.bobj=blpri;
		this.fobj=flpri;
		this.chobj=chpri;
		this.dbobj=dbpri;
			
		
		System.out.println(inobj+" "+" "+bobj+" "+fobj+" "+chobj+" "+dbobj);
	}
	
	public static void main(String[] args) {
		//primitive-int,short,byte,long,boolean,double,float,char
		//Object-Integer,Float,Boolean,Character,Byte,Short,Long,Double
		wrapperclass wrap=new wrapperclass(12,'q',23.3f);
		wrap.res(12, 'a', 23.4D, 2.3f, false);
		
		

	}

}
