


class MyGenerics <T1,T2>{
    int val;
    private T1 t1;
    private T2 t2;

    public MyGenerics(int val, T1 t1, T2 t2){
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }

    public int getVal() {
        return val;
    }

    public T1 getT1() {
        return t1;
    }
    public T2 getT2() {
        return t2;
    }

}

public class CL_110_Generics {

    public static void main(String[]args){


        MyGenerics<String,Integer>  g1 = new MyGenerics(21,"My String is my String1 ",344);

        String str = g1.getT1();
        System.out.println(str);

        Integer integer = g1.getT2();
        System.out.println(integer);

        System.out.println(g1.getVal());


    }
}
