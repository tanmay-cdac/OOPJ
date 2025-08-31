class Book {
    private String title;
    private String author;
    private boolean issued;
    private static int totalIssuedBooks = 0;

    Book(String title, String author, boolean issued) {
        this.title = title;
        this.author = author;
        this.issued = issued;
        if (issued) {
            totalIssuedBooks++;
        }
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

    public boolean isIssued() { 
        return issued;
    }
	
	public static int showTotalIssued(){
		return totalIssuedBooks;
	}
	
}

class LibraryBookTracker{
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter","J.K. Rowling", true);
        Book book2 = new Book("Five Point","Chetan Bhagat", false);
        Book book3 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", true);
		
		System.out.println(book1.getTitle() + " issued? " + book1.isIssued());
        System.out.println(book2.getTitle() + " issued? " + book2.isIssued());
        System.out.println(book3.getTitle() + " issued? " + book3.isIssued());
		
		System.out.println("Total books issued: " + Book.showTotalIssued());
    }
}
