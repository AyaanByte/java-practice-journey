

public class CL_31_Methods {
          // * Static Method
   static int logic(int x,int y){
        int z;
        if(x>y){
            z  =x+y;
        }else {
            z =(x+y)*5;
        }
          return z;
    }

    public static void main(String[] args) {

        int a=5;
        int b=7;
        int c;
        c=logic(a,b);
        // * Method invocation using Object creation
        // * CL_31_Methods obj=new CL_31_Methods();
        // * c= obj.logic(a,b);
        System.out.println(c);
          
        int a1=2;
        int b1=1;
        int c1;
        c1=logic(a1,b1);
        // * Method invocation using Object creation
        // * CL_31_Methods obj1=new CL_31_Methods();
        // * c1= obj1.logic(a1,b1);
        System.out.println(c1);

    }
}
