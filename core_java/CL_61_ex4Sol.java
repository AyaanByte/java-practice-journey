

class Library{

    String [] books;
    int no_of_books;

      Library(){
        this.books= new String[100];
        this.no_of_books = 0;
    }

    void addBook(String book){
       // this.books[no_of_books]= book;
        this.books[no_of_books]= book;
        no_of_books++;

        System.out.println(""+book+"Has been added!");
        System.out.println("--------------");
    }

    void showAvailableBook(){
        System.out.println("Available Books Are: ");

        for (String book:this.books) {
            if(book==null){
                continue;
            }
            System.out.println("* "+ book);
        }
    }

    void issueBook(String book){

      for (int i=0; i<this.books.length; i++){
            if(this.books[i].equals(book)){
                System.out.println("The Book Has Been issued!");
                this.books[i]=null;
                return;
            }
      }
        System.out.println("This Book Does Not Exist");
    }


    void returnBook(String book){
     addBook(book);
    }
   }


public class CL_61_ex4Sol {
    public static void main(String[] args) {
         /* *** You have to implement java library ***
         *  Methods : addBook, issueBook, returnBook , showAvailableBooks
         *  Properties:  Array to store available Books
         *   & Array to store issue books */


        Library centralLibrary= new Library();

                  // ***>> Adding Books
        centralLibrary.addBook("1). Think and Grow Rich 📕");
        centralLibrary.addBook("2).Algorithms 📚");
        centralLibrary.addBook("3).C++ 📘");
        centralLibrary.addBook("4).Java 📗");
        centralLibrary.addBook("5).Python 📙 ");
        centralLibrary.addBook("6).Machine Learning 📚");
        centralLibrary.addBook("7).sql 📖");
        centralLibrary.addBook("8).C 📑");
        centralLibrary.addBook("9).C#");
        // *->>> Available Books in text
        centralLibrary.showAvailableBook();
        // *->>> Adding 1 more Book
        centralLibrary.addBook("10).SQL");

         // *->>> Removing Book
//        centralLibrary.issueBook("C++");  // if you have to remove book

        // *->>> Available Books in text
        centralLibrary.showAvailableBook(); //  running the loop -- for available books





    }
}
