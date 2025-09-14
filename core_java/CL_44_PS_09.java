

class cylinder{
    private int radius;
    private int height;

    public cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }
    /*public void setRadius(int radius) {
            this.radius = radius;
    }
    public void setHeight(int height) {
        this.height = height;
    }*/

    public double surfaceArea(){
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius*height;
    }
    public double volume(){
        return Math.PI * radius * radius * height;
    }
}

   class Rectangle{
    private int length;
    private int breath;

       public Rectangle() {
           this.length = 4;
           this.breath = 5;
       }

       public Rectangle(int length, int breath) {
           this.length = length;
           this.breath = breath;
       }

       public int getLength() {
           return length;
       }

       public int getBreath() {
           return breath;
       }
   }

public class CL_44_PS_09 {
    public static void main(String[] args) {
           // * PRACTISE Problem-1
       cylinder myCylinder = new cylinder(12,9);
        System.out.println(myCylinder.getHeight());
        System.out.println(myCylinder.getRadius());
        // myCylinder.setHeight(12);
        // myCylinder.setRadius(9);


          // * PRACTISE Problem-2
               //Surface area
        System.out.println(myCylinder.surfaceArea());
               // Volume area
        System.out.println(myCylinder.volume());


          // * PRACTICE Problem-4
        Rectangle r = new Rectangle();
        System.out.println(r.getBreath());
        System.out.println(r.getLength());

        Rectangle r1 = new Rectangle(34,56);
        System.out.println(r1.getLength());
        System.out.println(r1.getBreath());


    }
}
