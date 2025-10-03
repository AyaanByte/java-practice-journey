    // ***-> Abstract classes and Interface <-***


abstract class Parent2{

      public Parent2(){
          System.out.println("I Am Constructor of Base2");
      }

      public void sayHello(){
          System.out.println("Hello");
      }
    abstract public void greet();
    abstract public void greet2();
}


class Child2 extends Parent2{

    @Override
    public void greet() {
        System.out.println("Good Morning");
    }
    @Override
    public void greet2() {
        System.out.println("Good afternoon");
    }
}


abstract class Child3 extends Parent2{
    public void th(){
        System.out.println("I am good ");
    }

}


public class CL_53_Abstract {
    public static void main(String[] args) {
   //Parent2 p = new Parent2(); --  error ^||^ :(
  // Child3 c3 = new Child3(); --  We cannot create object when we make class to abstract class- because it is abstract class
          Child2 c = new Child2();

    }
}
