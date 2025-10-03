

interface Camera{
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


interface wifi{
    String [] getNetwork();
    void connectToNetwork(String network);
}


class CellPhone{

    void callNumber(int phoneNumber){
        System.out.println("calling"+ phoneNumber);
    }

    void pickCall(){
        System.out.println("Connecting...");
    }

  }


class Smartphone extends CellPhone implements wifi,Camera{

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

}

public class CL_57_default_methods {
    public static void main(String[] args) {
      Smartphone sm= new Smartphone();
        String []ar = sm.getNetwork();
        sm.record4kVideo();

        for(String item:ar){
            System.out.println(item);
        }
    }
}
