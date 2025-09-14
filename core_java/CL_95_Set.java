
import java.util.HashSet;
public class CL_95_Set {
    public static void main(String [] args){
        HashSet<Integer> myHashSet = new HashSet<>(6,0.5f);
        myHashSet.add(6);
        myHashSet.add(8);
        myHashSet.add(3);
        // * If we add duplicate element in hashSet - only one HashSet-element will be visible
        myHashSet.add(11);
        myHashSet.add(11);

        // myHashSet.clear -- It will clear all hash-set
        // myHashSet.clear();

        // * We can see all element of hash-set using system.out.println();
        System.out.println(myHashSet);

        // *  Contains --  return true if the element is present in hashSet
        System.out.println(myHashSet.contains(11));

        // * isEmpty -- return true if the hashSet contains no elements
        System.out.println(myHashSet.isEmpty());

    }
}
