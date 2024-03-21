package Collection;
import java.io.*;

public class collections {
public synchronized void main() {
	System.out.println("Synchorized method");
}
public synchronized final void main(String res) {
	System.out.println("final method");
}
public int main(int a) {
	collections col=new collections();
	col.main();
	col.main("");
	return 1;
}

public static final synchronized void main(String[] args) {
	collections col=new collections();
	col.main();
	col.main("");
	System.out.println(col.main(3));
}
}
