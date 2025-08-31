class Vehicle {
    private String regNo;
    private String ownerName;
    private String vehicleType;

    private static int vehicleCount = 1;

    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.regNo = "MH-2025-" + vehicleCount++;
    }
	
    public String getRegNo() {
        return regNo;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getVehicleType() {
        return vehicleType;
    }
}

class VehicleRegistration {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Sahil", "Car");
        Vehicle v2 = new Vehicle("Abhishek", "Bike");

        System.out.println("Vehicle 1 -> RegNo: " + v1.getRegNo() + ", Owner: " + v1.getOwnerName() + ", Type: " + v1.getVehicleType());

        System.out.println("Vehicle 2 -> RegNo: " + v2.getRegNo() + ", Owner: " + v2.getOwnerName() + ", Type: " + v2.getVehicleType());
    }
}
