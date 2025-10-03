

public class CL_111_File_Handling {
   public static void main(String[]args){

//         *** Code to create a new FILE ***
       /*
       File myFile = new File("CL111File.txt");
        try{
            myFile.createNewFile();
         } catch (IOException e){
            System.out.println("Unable to create file");
            e.printStackTrace();
        }
       */

//          *** Code to Write a file  ***
       /*
       try {
           FileWriter fileWriter = new FileWriter("CL111File.txt");
           fileWriter.write(" *** This is our first file from this course ***\n       * which is made from the \n       * CL_111_File_Handling");
           fileWriter.close();
       } catch (IOException e){
           e.printStackTrace();
       }


       */
//        *** Code to Read a File ***
       /*
        File myFile = new File("CL111File.txt");
        try {
            Scanner scanner = new Scanner(myFile);
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
       */

//        *** Code to Delete a File ***
      /*
       File myFile = new File("CL111File.txt");
       if(myFile.delete()){
           System.out.println("I have deleted: "+ myFile.getName());
       }
       else{
           System.out.println("Some problem occurred while deleting the file");
       }


//      ***  whether the given file exist or not ***
      System.out.println(  myFile.exists());

//      ***  whether the file is Readable or not ***
      System.out.println(myFile.canRead());

//      ***  whether the file is writable or not ***
      System.out.println(myFile.canWrite());

//     *** Returns the name of the file ***
      System.out.println(myFile.getName());

//    *** Returns the size of the file in bytes ***
      System.out.println(myFile.length());

//          ***  getAbsolutePath  ***
      System.out.println(myFile.getAbsolutePath());

*/
   }
}
