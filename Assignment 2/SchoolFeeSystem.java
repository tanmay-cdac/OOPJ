class Student {
    private String name;
	private String className;
    private static int tuitionFee;
	
	static{
		tuitionFee = 30000;
		System.out.println("School Tuition Fee Initialized: " + tuitionFee);
	}

	Student(String name, String className) {
        this.name = name;
		this.className = className;
    }
	
	public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getClassName() {
        return className;
    }
    public void setClassName(String className) {
        this.className = className;
    }
	
	public static int getTuitionFee(){
		return tuitionFee;
	}
}

class SchoolFeeSystem{
    public static void main(String[] args) {
        Student student1 = new Student("Anjali", "10th");
        Student student2 = new Student("Vikram", "12th");
		
		System.out.println("Student 1: Name= "+student1.getName()+", Class= "+student1.getClassName()+", Tuition Fee="+student1.getTuitionFee());
        System.out.println("Student 2: Name= "+student2.getName()+", Class= "+student2.getClassName()+", Tuition Fee="+student2.getTuitionFee());
		
    }
}
