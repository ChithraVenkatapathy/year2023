package Collection;

import java.util.ArrayList;
import java.util.LinkedList;

class cusArrayList {
	int id;
	String name;
	int phone;
	public cusArrayList(int id,String name,int phone) {
		this.id=id;
		this.name=name;
		this.phone=phone;
	}
}

class display{
	ArrayList<cusArrayList> arrtype=new ArrayList<>();
	public void data(int[] id,String[] nsme,int[] phone) {
		//int n=7;
		for (int i=0;i<id.length;i++) {
			arrtype.add(new cusArrayList(id[i],nsme[i],phone[i]));
		}
		for (cusArrayList cusArrayList : arrtype) {
			System.out.println("id= "+cusArrayList.id+" name="+cusArrayList.name+" phone="+cusArrayList.phone);
		}
		
	}
}

class displayLinkedlist {
	LinkedList<cusArrayList> ll=new LinkedList<>();
	public void dis(int[] id,String[] name,int[] phone) {
		for (int i = 0; i < id.length; i++) {
			ll.add(new cusArrayList(id[i], name[i], phone[i]));
		}
		System.out.println("Custom linked list");
		for (cusArrayList i : ll) {
			
			System.out.println(i.id+" "+i.name+" "+i.phone);
		}
	}
}
public class customlinkedarraylist {

	public static void main(String[] args) {
		display dis=new display();
		int[] id= {1,2,3,4,5,6,7,8};
		int[] phone= {1234,1234,1321,1323,12313,123,123,13,13,13123};
		String[] name= {"name","name1","name2","name3","name4","name5","name6","name7","name8"};
		dis.data(id, name, phone);
		displayLinkedlist displ=new displayLinkedlist();
		displ.dis(id, name, phone);

	}

}
