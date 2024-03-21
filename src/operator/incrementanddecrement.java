package operator;

public class incrementanddecrement {

	public static void main(String[] args) {
		int i = 11;
        
        i = i++ + ++i;
         
        System.out.println(i);
        
        int a=11, b=22, c;
        
        c = a + b + a++ + b++ + ++a + ++b;
         
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        
        int l=0;
        
        l = l++ - --l + ++l - l--;
         
        System.out.println(l);
        
        int e=1, j=2, k=3;
        
        int m = e-- - j-- - k--;
         
        System.out.println("i="+e);
        System.out.println("j="+j);
        System.out.println("k="+k);
        System.out.println("m="+m);
        
        
        int ad=1, bc=2;
        
        System.out.println(--bc - ++ad + ++bc - --ad);
        int ia=19, ja=29, ka;
        
        
        ka = ia-- - ia++ + --ja - ++ja + --ia - ja-- + ++ia - ja++;
         
        System.out.println("ia="+ia);
        System.out.println("ja="+ja);
        System.out.println("ka="+ka);
        int ms = 0, n = 0;
        
        int p = --ms * --n * n-- * ms--;
        System.out.println(ms);
        System.out.println(n);
        System.out.println(p);
        
        int ar=1;
        
        ar = ar++ + ++ar * --ar- ar--;
         
        System.out.println(ar);
        
        int ma=1010, na=1010;
        
        System.out.println(ma++ / ++na * na-- / --ma); 
        
        int x = 001, y=010, z=100;
        
        int v = --x + y++ - z-- - --z + ++y - --x + y-- - --x;
         
        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("z="+z);
        System.out.println("v="+v);
        
        int q = 0, r = 0;
        
        System.out.println(--q * q++ * ++r * r++);
        
        double d = 1.5, D = 2.5;
        
        System.out.println(d++ + ++D);

	}

}
