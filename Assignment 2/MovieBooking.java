class Customer {
    private String name, ticketType = "Normal";
    private static int totalTicketsSold = 0;

    Customer(String name) {
        this.name = name;
        totalTicketsSold++;
    }
	 
	Customer(String name, String ticketType) {
        this.name = name;
		this.ticketType = ticketType;
        totalTicketsSold++;
    }
	
	public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTicketType() {
        return ticketType;
    }
    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }
	
	public static int showTotalTicketsSold(){
		return totalTicketsSold;
	}
	
}

class MovieBooking{
    public static void main(String[] args) {
        Customer customer1 = new Customer("Rahul");
        Customer customer2 = new Customer("Pooja", "Premium");
        Customer customer3 = new Customer("Amit");
		
		System.out.println("Customer 1: Name: "+customer1.getName()+", Ticket: "+customer1.getTicketType());
        System.out.println("Customer 2: Name: "+customer2.getName()+", Ticket: "+customer2.getTicketType());
        System.out.println("Customer 3: Name: "+customer3.getName()+", Ticket: "+customer3.getTicketType());
		
		System.out.println("Total Tickets Sold: " + Customer.showTotalTicketsSold());
    }
}
