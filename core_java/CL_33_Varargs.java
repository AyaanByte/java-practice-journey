

public class CL_33_Varargs {


//    static int sum(int a,int b){
//        return a+b;
//    }
//    static int sum(int a,int b,int c){
//        return a+b+c;
//    }
//    static int sum(int a,int b,int c,int d){
//        return a+b+c+d;
//    }


    static int sum(int... array) {
        // Available as int []west ={};
        int result = 0;
        for (int a : array) {
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("🎆🎆🎆🎆🎆🎆🎆🎆🎆🎆🎆🎆🎆🎆🎆🎆🎆🎆🎆🎆");
        System.out.println("Welcome to Varargs toturials ");

        System.out.println("The value of 4 and 5 is :" + sum(4, 5));
        System.out.println("The value of 4,3 and 5 is :" + sum(4, 3, 5));
        System.out.println("The value of 4,3,5 and 7 is :" + sum(4, 3, 5, 7));
        System.out.println("");
        System.out.println("       \t\t94 + 87 + 34 + 98 + 34  : \n «««««««« The calculation of the sum is »»»»»»»»  \n\t\t\t\t\t\t" + sum(94, 87, 34, 98, 34));


    }

}

