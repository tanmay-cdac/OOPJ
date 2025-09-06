class Book {
    private int bookId;
    private String title;
    private String author;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public int getBookId() { 
		return bookId; 
	}
    public String getTitle() { 
		return title; 
	}
    public String getAuthor() { 
		return author; 
	}
}

interface Notifyable {
    void sendNotification(String message);
}

abstract class LibraryMember implements Notifyable {
    protected int memberId;
    protected String name;
    protected Book[] borrowedBooks;
    protected int borrowedCount;

    public LibraryMember(int memberId, String name, int limit) {
        this.memberId = memberId;
        this.name = name;
        this.borrowedBooks = new Book[limit];
        this.borrowedCount = 0;
    }

    public abstract void borrowBook(Book book);

    public int getBorrowedCount() {
        return borrowedCount;
    }
}

class StudentMember extends LibraryMember {
    private static final int LIMIT = 3;

    public StudentMember(int memberId, String name) {
        super(memberId, name, LIMIT);
    }

    @Override
    public void borrowBook(Book book) {
        if (borrowedCount < borrowedBooks.length) {
            borrowedBooks[borrowedCount++] = book;
            System.out.println("StudentMember " + name + " borrowed " + borrowedCount + " books");
        } else {
            System.out.println("StudentMember " + name + " cannot borrow more than " + borrowedBooks.length + " books");
        }
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Notification sent to " + name + ": " + message);
    }
}

class FacultyMember extends LibraryMember {
    private static final int LIMIT = 5;

    public FacultyMember(int memberId, String name) {
        super(memberId, name, LIMIT);
    }

    @Override
    public void borrowBook(Book book) {
        if (borrowedCount < borrowedBooks.length) {
            borrowedBooks[borrowedCount++] = book;
            System.out.println("FacultyMember " + name + " borrowed " + borrowedCount + " books");
        } else {
            System.out.println("FacultyMember " + name + " cannot borrow more than " + borrowedBooks.length + " books");
        }
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Notification sent to " + name + ": " + message);
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book b1 = new Book(1, "Java Basics", "James Gosling");
        Book b2 = new Book(2, "OOP Concepts", "Bjarne Stroustrup");
        Book b3 = new Book(3, "Data Structures", "Donald Knuth");
        Book b4 = new Book(4, "Algorithms", "Robert Sedgewick");
        Book b5 = new Book(5, "Database Systems", "C. J. Date");
        Book b6 = new Book(6, "Operating Systems", "Silberschatz");

        StudentMember student = new StudentMember(101, "Amit");
        FacultyMember faculty = new FacultyMember(201, "Prof. Singh");

        student.borrowBook(b1);
        student.borrowBook(b2);

        faculty.borrowBook(b3);
        faculty.borrowBook(b4);
        faculty.borrowBook(b5);
        faculty.borrowBook(b6);

        student.sendNotification("Return books within 7 days");
        faculty.sendNotification("Return books within 14 days");
    }
}
