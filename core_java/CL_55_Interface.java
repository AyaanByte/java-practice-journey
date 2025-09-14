

interface Bicycle{
    int a = 45;
    void applyBreak(int decrement);
    void  speedUp(int increment);

}

interface hornBicycle{
    void blowHornKgf();
    void  blowHornBgm();
}


class AvonCycle implements Bicycle,hornBicycle{


     @Override
    public void applyBreak(int decrement){
        System.out.println("Applying Break");
    }
    @Override
    public void  speedUp(int increment){
        System.out.println("Applying Speed");
    }

    @Override
    public void blowHornKgf(){
        System.out.println("Kabhi Khushi Kabhi Gam pee pee pee pee");
    }
    @Override
    public void blowHornBgm(){
        System.out.println("Mai Hoo Naa Po Po Po Po");
    }


}


public class CL_55_Interface {
    public static void main(String[] args) {
       AvonCycle Cycle1= new AvonCycle();
       Cycle1.applyBreak(2);
       // ** You can create properties in interface
       // ** But you cannot modify the properties in interface as they are final
       System.out.println(Cycle1.a);

       Cycle1.blowHornBgm();
       Cycle1.blowHornKgf();
    }
}
