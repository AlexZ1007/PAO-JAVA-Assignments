package Lab4.Bookstore;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class BookstoreTest {
    private ArrayList<Book> books;
    public BookstoreTest() {
        books = new ArrayList<>();
    }

    public void create(){
        Scanner sc = new Scanner(System.in);
        String bookName, author, publisher;
        int pageCount;
        System.out.println("Creating a new book");
        System.out.println("Book name: ");
        bookName = sc.nextLine();
        System.out.println("Book author: ");
        author = sc.nextLine();
        System.out.println("Book publisher: ");
        publisher = sc.nextLine();
        do{
            System.out.println("Book pageCount: ");
            pageCount = sc.nextInt();
            if(pageCount <= 0){
                System.out.println("Page count needs to be greater than 0");
            }
        } while (pageCount <= 0);



        books.add(new Book(bookName, author, pageCount, publisher));
        System.out.println("Book created successfully");
    }

    public void read(){
        Scanner sc = new Scanner(System.in);
        int bookId;
        System.out.println("Enter book id: ");
        do{
            System.out.println("Enter book id: ");
            bookId = sc.nextInt();
        } while(bookId < 0 || bookId > books.size());
        sc.nextLine();
        System.out.println(books.get(bookId));
    }

    public void update(){
        Scanner sc = new Scanner(System.in);
        String bookName, author, publisher;
        int pageCount;
        int bookId;
        do{
            System.out.println("Enter book id: ");
            bookId = sc.nextInt();
        } while(bookId < 0 || bookId > books.size());
        sc.nextLine();

        System.out.println("Update book");
        System.out.println("Book name: ");
        bookName = sc.nextLine();
        System.out.println("Book author: ");
        author = sc.nextLine();
        System.out.println("Book publisher: ");
        publisher = sc.nextLine();
        do{
            System.out.println("Book pageCount: ");
            pageCount = sc.nextInt();
            if(pageCount <= 0){
                System.out.println("Page count needs to be greater than 0");
            }
        } while (pageCount <= 0);



        books.get(bookId).setTitle(bookName);
        books.get(bookId).setAuthor(author);
        books.get(bookId).setPublisher(publisher);
        books.get(bookId).setPageCount(pageCount);

        System.out.println("Book updated successfully");
    }

    public void delete(){
        Scanner sc = new Scanner(System.in);
        int bookId;
        System.out.println("Enter book id: ");
        do{
            System.out.println("Enter book id: ");
            bookId = sc.nextInt();
        } while(bookId < 0 || bookId > books.size());
        sc.nextLine();
        books.remove((int) bookId);
        System.out.println("Book deleted successfully");
    }

    public void all(){
        for (int i = 0; i < books.size(); i++) {
            System.out.println("ID:" + i);
            System.out.println(books.get(i).toString());

        }
    }

    public ArrayList<Book> getBooks() {
        return books;
    }


}
