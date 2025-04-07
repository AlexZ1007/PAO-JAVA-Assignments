package Lab4.Bookstore;

public class Main {
    public static void main(String[] args) {
        BookstoreTest bookstoreTest = new BookstoreTest();
        BookstoreCheck bookstoreCheck = new BookstoreCheck();

        bookstoreTest.create();
        bookstoreTest.create();

//        Verificare CRUD
//        bookstoreTest.all();
//        bookstoreTest.read();
//        bookstoreTest.update();
//        bookstoreTest.all();
//        bookstoreTest.delete();
//        bookstoreTest.all();


//        Verificare check
//        bookstoreCheck.checkCopy(bookstoreTest.getBooks());
          bookstoreCheck.compare(bookstoreTest.getBooks());
    }
}
