public class Book {

    String title;
    String authorName;
    int yearOfPublish;
    long isbn;

    public void  display() {

    }

    public static void main(String[] args) {

        Book book = new Book();
        System.out.println("book.title = " + book.title);
        System.out.println("book.authorName = " + book.authorName);
        System.out.println("book.yearOfPublish = " + book.yearOfPublish);
        System.out.println("book.isbn = " + book.isbn);

        book.title = "POWER OF NOW";
        book.authorName = "ECHKART TOLLE";
        book.yearOfPublish = 2004;
        book.isbn = 9878451236874L;

        System.out.println("book.title = " + book.title);
        System.out.println("book.authorName = " + book.authorName);
        System.out.println("book.yearOfPublish = " + book.yearOfPublish);
        System.out.println("book.isbn = " + book.isbn);


    }
}
