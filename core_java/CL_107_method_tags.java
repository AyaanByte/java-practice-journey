

/**
 * These is a good class
 */
public class CL_107_method_tags {
    /**
     *
     * @param args These are arguments supplied to the command line
     */
    public static void main(String[] args) {
        System.out.println("I am Main Method");
    }

    /**
     * Hello this is a method and this is the most beautiful method of these class
     * @param i this is the first number to add
     * @param j this is the second number to add
     * @return sum of two number as an integer
     * @throws Exception if i is 0
     * @deprecated this method is deprecated instead this please use + Operator
     */
    public int add(int i , int j)throws Exception{
        if(i==0){
            throw new Exception();
        }
      int  c;
      c = i +j;
      return c;
    }
}
