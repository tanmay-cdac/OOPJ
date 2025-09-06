class Book{
    private int copiesAvailable;
	
    public void addCopies(int n) {
        copiesAvailable += n;
    }
	
	public void removeCopies(int n) {
		if(copiesAvailable>=n){
			copiesAvailable -= n;
		}
		else{
			System.out.println("Not enough Copies Available");
		}
    }
    public int getCopiesAvailable() {
        return copiesAvailable;
    }
}

public class LibraryBookAvailability {
    public static void main(String[] args) {
        Book b = new Book();
        b.addCopies(3);
		b.removeCopies(1);
        System.out.println("Copies available = " + b.getCopiesAvailable());
    }
}
