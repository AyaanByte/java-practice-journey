

  // Creating a thread ➡➡➡➡➡>
   /*     *->>> There are two ways to create a thread in java
   *  1. By extending Thread class          ➡➡➡➡> that we have done in this programme
   *  2. By implementing Runnable interface ➡➡➡➡> that we will do in next programme*/

class MyThread1 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while (i<40000){
            System.out.println("Thread1 is Running ");
            System.out.println("Thread 1  Happy 🥰🥰🥰🥰");
            i++;
        }

    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<40000){
            System.out.println("Thread2 is Running ");
            System.out.println("Thread 2  Happy  🙂🙂🙂🙂🙄🙄");
            i++;
        }

    }
}

public class CL_70_Multi_thread {
    public static void main(String[] args) {

        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();


    }
}
