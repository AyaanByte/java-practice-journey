

interface Camera2{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4kVideo(){
        greet();
        System.out.println("Recording in 4k Video Camera");
    }
}


interface wifi2{
    String [] getNetwork();
    void connectToNetwork(String network);
}


class CellPhone2{

    void callNumber(int phoneNumber){
        System.out.println("calling "+  phoneNumber);
    }

    void pickCall(){
        System.out.println("Connecting...");
    }

}


class Smartphone2 extends CellPhone2 implements wifi2,Camera2{

    public void takeSnap(){
        System.out.println("Taking Snap...");
    }
    public void recordVideo(){
        System.out.println("Recording Video ...");
    }
    public String[] getNetwork(){
        System.out.println("Getting List Of Networks...");
        String[]networkList = {"Harry","Prakash","ajay","Anjali"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to network"+ network);

    }

    public void simpleMeth(){
        System.out.println("Simple Meth");
    }

}


public class CL_59_Polymorphism {
    public static void main(String[] args) {
        Camera2 cam2 = new Smartphone2(); // * This is smartphone but use it as camera  Dynamic Dispatch Method

        // cam2.getNetwork(); --> Not Allowed
        // cam2.simpleMeth(); --> Not Allowed
          cam2.record4kVideo();

          Smartphone2 smrt = new Smartphone2();
          smrt.simpleMeth();
          smrt.recordVideo();
          smrt.getNetwork();
          smrt.callNumber(  90786);


    }
}





