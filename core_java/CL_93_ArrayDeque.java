
import java.util.ArrayDeque;
public class CL_93_ArrayDeque {
    public static void main(String [] args){
        ArrayDeque<Integer> arraydeque= new ArrayDeque<>();
        arraydeque.add(6);
        arraydeque.add(56);
        arraydeque.add(9);

        // * Inserts the specified element at the front of this deque.
          arraydeque.addFirst(5);
//        * Inserts the specified element at the front of this deque.
//        arraydeque.offerFirst(4);
        // * Inserts the specified element at the end of this deque.
          arraydeque.addLast(99);
       // * Inserts the specified element at the end of this deque.
//        arraydeque.offerLast(4);

//      arraydeque.removeFirst();
//      arraydeque.pollFirst();
// * Retrieves and removes the first element of this deque.
// * This method differs from pollFirst only in that it throws
// * an exception if this deque is empty.

//        arraydeque.removeLast();
//        arraydeque.pollLast();
//   *    Retrieves and removes the last element of this deque.
//   *    This method differs from pollLast only in that it
//   *    throws an exception if this deque is empty.

         System.out.println(arraydeque.getFirst());
 // * access, but does not remove, the first element of this deque.
 // * This method differs from peekFirst only in that it throws
 // * an exception if this deque is empty.

         System.out.println(arraydeque.getLast());
// * access, but does not remove, the last element of this deque.
// * This method differs from peekLast only in that it throws an exception
// * if this deque is empty.
    }
}
