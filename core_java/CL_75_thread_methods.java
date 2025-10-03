


class MyNewThr1 extends Thread{
    @Override
    public void run() {
           int i=0;
        while (i<56666) {
            System.out.println("Thank you-🙏 -->🔺🔹🔺🔹🔺🔹🔺🔹🔺🔹🔺🔹🔺🔹🔺🔹🔺€§§§¶®†‡°¤-----------------");
            try {
                Thread.sleep(120);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
             i++;
        }
    }

}


class MyNewThr2 extends Thread{
    @Override
    public void run() {
       int  i=0;
        while (i<56666) {
            System.out.println("Thank you-🙏  -->🔷🔹🔷🔹🔷🔹🔷🔻🔷🔹🔷🔹🔷🔹🔷");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }

}


public class CL_75_thread_methods {
    public static void main(String[] args) {

     MyNewThr1 thr1 = new MyNewThr1();
     MyNewThr2 thr2 = new MyNewThr2();

     thr1.start();
//        try{
//            thr1.join();
//        }catch (Exception e){
//            System.out.println(e);
//        }
     thr2.start();



    }
}
