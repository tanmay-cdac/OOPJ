class Passenger {
    private String name,  seatType = "General";
    private int age;
    private static int totalTicketsBooked = 0;

    Passenger(String name, int age) {
        this.name = name;
        this.age = age;
        totalTicketsBooked++;
    }
	 
	Passenger(String name, int age, String seatType) {
        this.name = name;
        this.age = age;
		this.seatType = seatType;
        totalTicketsBooked++;
    }
	
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
	public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSeatType() {
        return seatType;
    }
    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }
	
	public static int showTotalPassengers(){
		return totalTicketsBooked;
	}
	
}

class RailwayBooking{
    public static void main(String[] args) {
        Passenger passenger1 = new Passenger("Ravi", 25);
        Passenger passenger2 = new Passenger("Anita", 30, "AC Sleeper");
        Passenger passenger3 = new Passenger("Suresh", 40);
		
		System.out.println("Passenger 1: Name: "+passenger1.getName()+", Age: "+passenger1.getAge()+", Seat: "+passenger1.getSeatType());
        System.out.println("Passenger 2: Name: "+passenger2.getName()+", Age: "+passenger2.getAge()+", Seat: "+passenger2.getSeatType());
        System.out.println("Passenger 3: Name: "+passenger3.getName()+", Age: "+passenger3.getAge()+", Seat: "+passenger3.getSeatType());
		
		System.out.println("Total Passengers Booked: " + Passenger.showTotalPassengers());
    }
}
