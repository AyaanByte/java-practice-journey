


class C1{
        public int a = 5;
     protected int b =56;
               int c = 78;
       private int d = 29;


    public void meth1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}


public class CL_66_access_modifier {
    public static void main(String[] args) {
         C1 c = new C1();
         c.meth1();
         System.out.println(c.a);
         System.out.println(c.b);
         System.out.println(c.c);

        // System.out.println(c.d);
        //  *->> ^^|^^ d has Private access we cannot use private modifier
        //  *    in same package,subclass and world

    }
}
