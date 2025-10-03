

class Practice13A extends Thread{
    @Override
    public void run(){
      int i=0;
      while(i<=5000){
          try {
              Thread.sleep(300);
          }
          catch (Exception e){
              System.out.println(e);
          }
          System.out.println( "🙅🤷 Good Morning!!");
          i++;
      }
    }
}


class Practice13B extends Thread{
    @Override
    public void run() {
        int j=0;
        while(j<=5000) {
            try {
                Thread.sleep(200);
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println( "💂⤘ Ŵęľ©Őɱϵ");
            j++;
        }
    }
}




public class CL_76_PS_13 {
    public static void main(String[]args){
     Practice13A pA = new Practice13A();
     Practice13B pB = new Practice13B();
     pA.setPriority(5);
     pB.setPriority(9);
     System.out.println(pA.getPriority());
     System.out.println(pB.getPriority());
     System.out.println(pB.getState());  // * Thread running state

     pA.start();
     pB.start();
        System.out.println(pB.getState());  // * Thread running state
        System.out.println(Thread.currentThread().getState());

//   * getStace();  => is a method that gives thread current state : it is runnable or new

    }
}
