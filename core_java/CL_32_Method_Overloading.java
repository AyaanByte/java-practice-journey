

public class CL_32_Method_Overloading {



  static void change2(int []arr){
       arr[0]=23;
    }
    static void foo(){
        System.out.println("Good Morning Bro!");
    }

    static void foo(int a){
        System.out.println("Good Morning "+ a +" Bro!");
    }
    static void foo(String a,String b){
        System.out.println("Good Morning "+ a +" Bro!");
        System.out.println("Good Morning "+ b +" Bro!");
    }

    static void tellJoke() {
        System.out.println("I Invented a new word!\n"+"Plagiarism");
    }

   public static void main (String[]args){

            // * tellJoke();
            // * Changing the array
            int[] marks = {33, 44, 67, 98, 56, 85};
            change2(marks);
            System.out.println("The Value of X after running change is " + marks[0]);


            // * Method Overloading
            // * Two or more method can have same name but different parameter
            // *-> such method are Overloading method
            foo();
            foo(242);
            foo("Alice", "Bob");
            // * Arguments are actual!

  }

}
