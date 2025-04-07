package Lab4.Bookstore;


import java.util.ArrayList;
import java.util.Scanner;

public class BookstoreCheck {
    public void checkCopy(ArrayList<Book> books) {
        Scanner sc = new Scanner(System.in);
        int bookId;
        do{
            System.out.println("Enter book id: ");
            bookId = sc.nextInt();
        } while(bookId < 0 || bookId > books.size());
        sc.nextLine();

        boolean found = false;
        for (int i = 0; i < books.size(); i++) {
            if(i == bookId){
                continue;
            }
            Book book = books.get(i);
            if(book.equals(books.get(bookId))){
                System.out.println("The book exists twice");
                System.out.println(book);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("The book exists only once");
        }
    }

    public void compare(ArrayList<Book> books) {
        Scanner sc = new Scanner(System.in);
        int bookId1, bookId2;

        do{
            System.out.println("Enter book 1 id: ");
            bookId1 = sc.nextInt();
        } while(bookId1 < 0 || bookId1 > books.size());
        sc.nextLine();

        do{
            System.out.println("Enter book 2 id: ");
            bookId2 = sc.nextInt();
        } while(bookId2 < 0 || bookId2 > books.size());
        sc.nextLine();

        Book book1 = books.get(bookId1);
        Book book2 = books.get(bookId2);

        System.out.println("This book has more pages:");
        if(book1.getPageCount() < book2.getPageCount()){
            System.out.println(book2);
        } else{
            System.out.println(book1);
        }
    }

}
