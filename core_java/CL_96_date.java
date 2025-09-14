

public class CL_96_date {
    public static void main(String [] args){
        System.out.println("Since 1970:");
        System.out.println("Milliseconds -> "+System.currentTimeMillis());
        System.out.println("Seconds -> "+System.currentTimeMillis()/1000);
        System.out.println("Hours -> "+ System.currentTimeMillis()/1000/3600);
        System.out.println("Days -> "+System.currentTimeMillis()/1000/3600/24);
        System.out.println("Years -> "+System.currentTimeMillis()/1000/3600/24/365);
    }
}
