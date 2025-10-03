


class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I Am In Base And Setting X Now ");
        this.x = x;
    }

    public void printMe(){
        System.out.println("I Am Constructor");
    }
}




class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}


public class CL_45_inheritance {
    public static void main(String[] args) {
        // * Creating an object of  Base Class
          Base  bse = new Base();
          bse.setX(4);
          System.out.println(bse.getX());

          // * Creating an object of  Derived Class
          Derived  drv = new Derived();
          drv.setX(43);
          System.out.println(drv.getX());

    }
}
