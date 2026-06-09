import java.util.ArrayList;

public class Library {

    ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {

        for (Book book : books) {

            String status;

            if (book.issued) {
                status = "Issued";
            } else {
                status = "Available";
            }

            System.out.println(
                book.id + " " +
                book.title + " " +
                book.author + " " +
                status
            );
        }
    }

    public void searchBook(String title) {

        for (Book book : books) {

            if (book.title.equalsIgnoreCase(title)) {
                System.out.println("Book Found:");
                System.out.println(book.id + " " + book.title + " " + book.author);
                return;
            }
        }

        System.out.println("Book Not Found");
    }

    public void issueBook(String title) {

        for (Book book : books) {

            if (book.title.equalsIgnoreCase(title)) {

                if (!book.issued) {
                    book.issued = true;
                    System.out.println("Book Issued Successfully");
                } else {
                    System.out.println("Book Already Issued");
                }

                return;
            }
        }

        System.out.println("Book Not Found");
    }

    public void returnBook(String title) {

        for (Book book : books) {

            if (book.title.equalsIgnoreCase(title)) {

                if (book.issued) {
                    book.issued = false;
                    System.out.println("Book Returned Successfully");
                } else {
                    System.out.println("Book Was Not Issued");
                }

                return;
            }
        }

        System.out.println("Book Not Found");
    }
}