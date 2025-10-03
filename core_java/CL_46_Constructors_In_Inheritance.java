

class Base1 {

     Base1() {  //-> Constructor
        System.out.println("I am a constructor");
     }
     Base1(int x) {  //-> Constructor
        System.out.println("I am a overloaded constructor of Base with one argument as: "+ x);
     }


}




class Derived1 extends Base1{

      Derived1(){
         // * if we have class of two constructor
         // * one has argument and one has not  argument  for that if we want one argument constructor
         // * we use super keyword
         //super(0);
         System.out.println("I am a derived class Constructor");
       }


       Derived1(int x,int y){
         super(x);
          System.out.println("I am a overloaded constructor of  Derived with one argument as: "+ y);
       }


 }



 class ChildDerived extends Derived1{
    ChildDerived(){
        System.out.println("I am a Child of Derived constructor");
    }
    ChildDerived(int x,int y, int z){
         super(x,y);
        System.out.println("I am a overloaded constructor of  ChildDerived with one argument as: "+ z);

    }

 }





public class CL_46_Constructors_In_Inheritance {
    public static void main(String[]args){
        //Base1 Bse = new Base1();
        //Derived1 Drv = new Derived1();
        //Derived1 Drv = new Derived1(14,6);
        ChildDerived CD = new ChildDerived(12,13,15);


    }
}
