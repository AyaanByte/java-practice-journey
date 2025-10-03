

enum Size{
    SMALL, MEDIUM,LARGE, EXTRALARGE
}

class Example{
    Size pizzaSize;

    public Example(Size pizzaSize){
        this.pizzaSize = pizzaSize;
    }

    public void orderPizza(){
        switch (pizzaSize) {
            case SMALL -> System.out.println("I Ordered Small Size Pizza");
            case MEDIUM -> System.out.println("I Ordered Medium Size Pizza");
            case LARGE -> System.out.println("I Ordered Large Size Pizza");
            case EXTRALARGE -> System.out.println("I Ordered ExtraLarge Size Pizza");
        }
    }


}


public class Z_DummyClass {

     public static void main(String[] args) {

       Example example = new Example(Size.LARGE);
       example.orderPizza();


      char unicode = '\u9999';

      for(char i=0; i<unicode; i++){
          System.out.print(i);
          System.out.print("\t");

          if(i%10==0){
              System.out.println();
          }

      }



     }

}
