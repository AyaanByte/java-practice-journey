
import java.util.*;
//                 ****>>> ArrayList <<<****
// * The wrapper class in Java provides the mechanism to convert primitive Datatype into object
// **> Java is an object-oriented programming language,
// *   so we need to deal with objects many times like in Collections,
// *   Serialization, Synchronization, etc.
//            *** Conversion ***
//    * Primitive Datatype   ---   * Wrapper Class
//    * boolean              ---   * Boolean
//    * char                 ---   * Character
//    * byte                 ---   * Byte
//    * short	             ---   * Short
//    * int	                 ---   * Integer
//    * long	             ---   * Long
//    * float	             ---   * Float
//    * double	             ---   * Double




public class CL_91_arrayList {
    public static void main(String []args){
     ArrayList<Integer> l1 = new ArrayList<>();
     ArrayList<Integer> l2 = new ArrayList<>(5);

        l2.add(96); // * This will add Number to ArrayList
        l2.add(40);
        l2.add(34);
        l2.add(26);
        l2.add(96);


     l1.add(6);
     l1.add(7);
     l1.add(4);
     l1.add(6);
     l1.add(5);
     l1.add(0,9);  // * This will add number to  specific position in ArrayList
     l1.add(0,1);
//   l1.addAll(l2); // * This will add l2 arraylist in l1
     l1.addAll(0,l2);
     // * This will add l2 - arraylist in l1 at specific position

//   l2.clear();
//   * l2.clear -- this will clear all values in given arraylist
     System.out.println(l1.contains(7));
     System.out.println(l1.indexOf(6));
     System.out.println(l1.lastIndexOf(6));

      l1.trimToSize();
//  * l1.trimToSize() ->
//  * This will trim the left part of your array-like
//  * if you have given the space of 500 but you only used
//  * 240 so it will automatically delete the remaining element
//  * which will save the time of program and memory

    l1.set(1,567); // ***>>> it will replace 18 with 567 at index 1

    System.out.println(l1.subList(3,6));
    // * This will return the value in the range of 3rd to 5th element which is stored in the array list

        for(int i=0; i<l1.size(); i++){
            System.out.print(l1.get(i));  // * this will print all values in the given arraylist
            System.out.print(", ");
        }
     System.out.println("\n"+l1.equals(l2)); // * whether the both arraylist is same or not

    }
}
