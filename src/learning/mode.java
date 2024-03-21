package learning;

public class mode {
	public static int loop (int i) {
		return i+loop(i);
	}

	public static void main(String[] args) {
		
		try {
			System.out.println(mode.loop(1));

			for(;;) {
				System.out.println("Hi");
			}
			
			
		}catch(Exception ex) {
						System.out.println(ex.getCause());
		}
		

	}

}
