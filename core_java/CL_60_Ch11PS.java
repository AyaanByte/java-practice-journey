

abstract class Pen{
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen{
    @Override
    void write(){
  System.out.println("Write");
    }
    @Override
    void refill(){
  System.out.println("Refill");
    }
    void changeNib(){
  System.out.println("Changing the Nib");
    }
}

class Monkey{
    void jump(){
        System.out.println("Jumping...");
    }
    void Bite(){
        System.out.println("Biting...");
    }
}

interface BasicAnimal{
 void eat();
 void sleep();

}

class Human extends Monkey implements BasicAnimal{
    @Override
    public void eat(){
        System.out.println("Eating");
    }

    @Override
    public void sleep(){
        System.out.println("Sleeping");
    }

   void speak(){
       System.out.println("Hello sir");
   }



}


public class CL_60_Ch11PS {
    public static void main(String[] args) {
     // * Question-1 + Question-2
     FountainPen pen = new FountainPen();
     pen.changeNib();

     // * Question-3
      Human h1 = new Human();
      h1.sleep();

     // * Question-5
      Monkey m1 = new Human();
    // m1.speak(); --> cannot use speak method because the reference is monkey which does not have monkey method
    }
}
