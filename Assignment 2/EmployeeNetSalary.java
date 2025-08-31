
class Employee {
	private String name;
    private double basicSalary;
	private int id;
	private static int counter = 1001;

	Employee() {
		name = "Unknown";
		basicSalary = 20000;
    }	
	Employee(String name, double basicSalary) {
		this.id = counter++;
		this.name = name;
		this.basicSalary = basicSalary;
    }	
	public String getName() {
        return name;
    }
    public void setName(String Name) {
        this.name = name;
    }
    public double getSalary() {
        return basicSalary;
    }
    public void setSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }
	public int getID(){
		return id;
	}
	public double calculateNetSalary() {
        double hra = 0.10 * basicSalary;
        double da  = 0.05 * basicSalary;
        double pf  = 0.02 * basicSalary; 
        return basicSalary + hra + da - pf;
    }
}

class EmployeeNetSalary{
    public static void main(String[] args) {
        Employee emp1 = new Employee("Sahil", 40000);
		Employee emp2 = new Employee("Abhishek", 20000);
		System.out.println("Account 1: Employee ID= "+emp1.getID()+", Name= "+emp1.getName()+", Basic Salary= "+emp1.getSalary()+", Net Salary= "+emp1.calculateNetSalary());
		System.out.println("Account 2: Employee ID= "+emp2.getID()+", Name= "+emp2.getName()+", Basic Salary= "+emp2.getSalary()+", Net Salary= "+emp2.calculateNetSalary());
    }
}
