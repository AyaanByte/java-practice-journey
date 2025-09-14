
// *              **** Anonymous-Class ****
// * In Java, a class can contain another class known as nested class.
// * It's possible to create a nested class without giving any name.
// * A nested class that doesn't have any name is known as an anonymous class.

// * This is simple-interface which has two methods
interface interfaceAnonymous{
    void function1(int a);
    void function2();
}

public class CL_109_Anonymous {
    public static void main(String[]args){

         // * This is Simple-Anonymous class inside a class -- this is best shortcut for making class
        interfaceAnonymous anonymous = new interfaceAnonymous(){
            @Override
            public void function1(int a){
                System.out.println("This is function 1 :" + a);
            }
            @Override
            public void function2(){
                System.out.println("This is function 2 ");
            }
        };

        anonymous.function1(34);
        anonymous.function2();


    }


}

/*
   //             **** Without-Anonymous-Class ****  -- it is not good (but we can use it)

package com.company.JAVA;
    // * Interface
interface interfaceAnonymous{
    void function1(int a);
    void function2();
}
   // * A class which implements interface
class AnonymousClass implements interfaceAnonymous{

    @Override
    public void function1(int a) {
        System.out.println("This is function 1 :" + a);
    }

    @Override
    public void function2() {
        System.out.println("This is function 2 ");
    }
}

public class CL_109_Anonymous {
    public static void main(String[] args) {
        // * Creating Object of class
        AnonymousClass anonymous = new AnonymousClass();
        // * printing functions
        anonymous.function1(45);
        anonymous.function2();
    }
}

*/