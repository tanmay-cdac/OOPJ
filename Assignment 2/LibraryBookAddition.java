class Book {
    private int bookId;
    private String title;
    private String author;

    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }
	
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

class Library {
    private String libraryName;
    private static int totalBooks = 0;

    Library(String libraryName) {
        this.libraryName = libraryName;
    }

    public void addBook(Book b) {
        totalBooks++;
        System.out.println("Book Added -> ID: " + b.getBookId() +", Title: " + b.getTitle() +", Author: " + b.getAuthor());
    }

    public void displayTotalBooks() {
        System.out.println("Total Books in " + libraryName + ": " + totalBooks);
    }
}

class LibraryBookAddition {
    public static void main(String[] args) {
        Library lib = new Library("City Central Library");

        Book book1 = new Book(101, "Java Programming", "James Gosling");
        Book book2 = new Book(102, "Effective Java", "Joshua Bloch");

        lib.addBook(book1);
        lib.addBook(book2);

        lib.displayTotalBooks();
    }
}
