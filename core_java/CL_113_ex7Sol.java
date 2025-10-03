
import java.util.ArrayList;

/* * Create a library management system which is capable of issuing books
 * to the students .
 * Books Should have info like :
 * 1. Book Name
 * 2. Book Author
 * 3. Issued to
 * 4. Issued on
 * Users should able to add books , return issue books , issue book
 * Assume that all the users are registered with their names
 * in the central database
 */


class Book{
    public String name,
                  author,
                  issued_to,
                  issued_on;

    public Book(String algorithms, int i) {
    }
}

class MyLibrary{
  public ArrayList<Book> books;

  public MyLibrary(ArrayList<Book> books){
      this.books = books;
  }
  public void addBook(Book book){
      System.out.println("The book has been added to the library");
    this.books.add(book);

  }
  public void issued_Book(Book book, String issued_to){
      System.out.println("The book has been issued from the library to "+ issued_to);
      this.books.remove(book);
  }
  public void returnBook(Book b){
      System.out.println("The book has been returned");
      this.books.add(b);
  }


}


public class CL_113_ex7Sol {
    public static void main(String[]args){
        ArrayList<Book> bk = new ArrayList<>();
        bk.add(new Book("Algorithms",2));
        MyLibrary lb = new MyLibrary(bk);
    }
}
