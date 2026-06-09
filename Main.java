public class Main {

    public static void main(String[] args) {

        Library library = new Library();

        Book b1 = new Book(101, "Java", "James");
        Book b2 = new Book(102, "Python", "Guido");

        library.addBook(b1);
        library.addBook(b2);

        library.searchBook("Java");
        library.issueBook("Java");
        library.returnBook("Java");
        library.displayBooks(); 

        System.out.println("Books added successfully");
    }
}