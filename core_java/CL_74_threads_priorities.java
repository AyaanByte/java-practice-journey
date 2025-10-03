

class MyThr1 extends Thread{

    public MyThr1(String name){
        super(name);
    }

   public void run() {
       while (true) {
           System.out.println("Thank you🙏 " + this.getName());
       }
   }

}

public class CL_74_threads_priorities {
    public static void main (String[]args){
      // *->> Ready Queue : thread1,thread2,thread3,thread4,thread5
      // * ⬇⬇⬇⬇⬇⬇⬇ this thread is ready to start  and maintain by thread scheduler in jvm
       MyThr1 t1= new MyThr1("Unique1 |");
       MyThr1 t2 = new MyThr1("Unique2  ||");
       MyThr1 t3 = new MyThr1("Unique3   |||");
       MyThr1 t4= new MyThr1("Unique4    ||||");
       MyThr1 t5= new MyThr1("Unique5 (Most Important)");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MAX_PRIORITY);

       t1.start();
       t2.start();
       t3.start();
       t4.start();
       t5.start();


    }
}
