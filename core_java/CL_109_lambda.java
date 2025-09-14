
// * if we have only one method in interface at that time we can use lambda expression
// * @FunctionalInterface annotation - we can use functional interface annotation
// * when there is only one method in interface
@FunctionalInterface
interface DemoAno{
    void meth1(int a);
}

public class CL_109_lambda {

    public static void main(String[]args){
        // * This is lambda expression

        DemoAno obj = (a)->{
            System.out.println("I am Method 1 - From this lambda "+a);
        };
        obj.meth1(6);

    }
}



/*

  //           *** Without LAMBDA-Expression ***
package com.company.JAVA;

@FunctionalInterface
interface DemoAno{
    void meth1(int a);
}


class HarryFunc implements DemoAno{
    @Override
    public void meth1(int a){
        System.out.println("This is method 1 :"+a);
    }
}


public class CL_109_lambda {
     public static void main(String[]args){

         HarryFunc hfc = new HarryFunc();
         hfc.meth1(45);
    }
}


*/
