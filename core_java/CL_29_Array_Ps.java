
                 //ARRAY PRACTISE SET
public class CL_29_Array_Ps {
    public static void main(String[] args) {


//     Practise problem-1
       /* float[]marks={45.5f, 78.5f, 96.5f ,69.5f ,79.6f};

         float sum=0;
        for(float element:marks){
            sum=sum+element;
        }
        System.out.println("The value of sum is :"+sum);*/

//     * Practise problem-2
     /*  float[]marks={45.5f,78.5f,96.5f,69.5f,79.6f};
         float num=45.5f;
         boolean isInArray=false;
        for(float element:marks){
            if(num==element){
                isInArray=true;
                 break;
            }
         }
        if(isInArray==true){
            System.out.println("The value is present in the array");
        }else {
            System.out.println("The Value is not present in the array");
        }*/

//    *    Practise Problem-3
      /*  float[]marks={45.5f,78.5f,96.5f,69.5f,79.6f};
        float sum=0;
        for(float element:marks){
            sum=sum+element;
        }
        System.out.println("The Value of average marks is:"+sum/marks.length);*/

//    *    Practise Problem-4

        /*int [][]mat1 = { {1,2,3},
                         {4,5,6}};
        int [][]mat2 = { {7,8,9},
                         {15,11,12}};
        int [][]result = { {0,0,0},
                           {0,0,0}};
        for(int i=0;i<mat1.length;i++){
            for(int j=0; j<mat1[i].length;j++){
                System.out.format("Setting Value for i=%d and j=%d\n",i,j);
                result[i][j] =mat1[i][j]+mat2[i][j];
            }
        }

        for(int i=0;i<mat1.length;i++){
            for(int j=0; j<mat1[i].length;j++){
                System.out.print(result[i][j]+" ");
                result[i][j] =mat1[i][j]+mat2[i][j];
            }
        }*/

//    *    Practise Problem- 5   -Reverse the array
/*
//     swap-->  array=1,2,3,4,5,6   TO   array=6,5,4,3,2,1
        int []arr ={1,2,3,4,5,6};
        int l= arr.length;        //Array length is 6 -- l=6
        int n=Math.floorDiv(l,2); //= 3
        int temp;                 //Empty Box,space or array
       for(int i=0; i<n; i++){
           //swap a[i]  and a[l-1-i]
           temp= arr[i];
           arr[i]= arr[l-1-i];
           arr[l-1-i]=temp;
    }
        for(int element:arr){
            System.out.print(element+" ");
        }*/

        // *  reverse array  in Another way

     /*   int []arr1 ={1,2,3,4,5,6};
        System.out.println("The Original array is :");
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
        int []arr ={1,2,3,4,5,6};
        System.out.println("The Reverse array is :");
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }*/


        // * Math.floorDiv(8,2) = to Divide 8/2
        /*int n=Math.floorDiv(8,2);
        System.out.println(n);*/

//       *  Practise Problem -6
      /*  int []arr ={1,2,3,455,5,-7886};
        int max=Integer.MIN_VALUE;
        for(int element:arr){
            if(element>max){
                max=element;
            }
        }
        System.out.println("The Maximum value of element in this array is:"+ max);*/


    }
}
