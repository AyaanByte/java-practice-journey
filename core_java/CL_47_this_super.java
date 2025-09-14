

class EkClass{

    int a;

    EkClass(int a){
        this.a = a;
    }

     public int getA(){
         return a;
     }



}


class DoClass extends EkClass{
     DoClass(int c){
         super(c);
         System.out.println("I am a constructor");
     }
}

public class CL_47_this_super {
    public static void main(String[] args) {
        EkClass ek = new EkClass(5);
        System.out.println(ek.getA());

       DoClass dc = new DoClass(15);
        
    }
}
