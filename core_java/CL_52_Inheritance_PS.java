

 class Circle{
   public int radius;


     Circle (int r){
        this.radius= r;
         System.out.println("I Am Circle parametrized constructor");
     }

   public double area(){
       return Math.PI*this.radius*this.radius;
   }


 }



 class Cylinder extends Circle{
       public int height;

         Cylinder(int r ,int h){
            super(r);
            System.out.println("I am Cylinder parameterized constructor");
            this.height=h;
         }
       public double volume(){
           return Math.PI*this.radius*this.radius*this.height;
           }


 }




public class CL_52_Inheritance_PS {
    public static void main(String[] args) {
         //Circle   obj1  = new Circle(12);
           Cylinder obj = new Cylinder(12,4);
        // * Problem-1

    }
}
