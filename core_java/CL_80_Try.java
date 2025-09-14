

public class CL_80_Try {
    public static void main(String [] args){
        int a = 6000;
        int b = 0;
         // * Without Try
        int d = a/b;
        System.out.println(d);

        // * With Try
        try{
            int c = a/b;
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println("We failed to divide. Reason :");
            System.out.println(e);
        }
        finally{
            System.out.println("Done\nEnd Of The Line");
        }


    }
}
