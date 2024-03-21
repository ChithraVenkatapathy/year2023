package predefinedmethod;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
//program to understand seraliable and deseralizable
class seralize implements java.io.Serializable{
	public int a;
	public transient int b;
	public static String c;
	//transient and static values do not get serialized
	seralize(int a,int  b, String c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
}
class searliz implements Serializable{
	//public static final long Seralia
}
public class seralization {
//serialVersionUID
		private static final long serialVersionUID = 1L;
		
		public static void print(seralize ser) {
			System.out.println(ser.a);
			System.out.println(ser.b);
			System.out.println(ser.c);
		}
		
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		seralize ser=new seralize(10, 20, "searlization");
		String fileName="file.txt";
		FileOutputStream fo=new FileOutputStream(fileName);
		ObjectOutputStream out=new ObjectOutputStream(fo);
		out.writeObject(ser);
		out.close();
		fo.close();
		System.out.println("Seralization is completed");
		System.out.println("Desearlization is started");
		FileInputStream fi=new FileInputStream(fileName);
		ObjectInputStream oi=new ObjectInputStream(fi);
		ser=null;
		ser=(seralize)oi.readObject();
		print(ser);
		oi.close();
		fi.close();
	}

}
