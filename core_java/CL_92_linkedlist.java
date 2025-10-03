

import java.util.LinkedList;

public class CL_92_linkedlist {
    public static void main(String[] args) {

        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();

        l2.add(96);
        l2.add(40);
        l2.add(34);
        l2.add(26);
        l2.add(96);


        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(5);
        l1.add(0,9);
        l1.add(0,1);
 //     l1.addAll(l2);
        l1.addAll(0,l2);
  //   l2.clear();
        l1.addLast(999);
        l1.addFirst(111);
        System.out.println(l1.contains(7));
        System.out.println(l1.indexOf(6));
        System.out.println(l1.lastIndexOf(6));




        l1.set(1,567); // ***>>> it will replace 18 with 567 at index 1

        for(int i=0; i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }


    }
}
