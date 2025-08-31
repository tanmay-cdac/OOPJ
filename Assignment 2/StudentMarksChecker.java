class Student {
    private int rollNo;
	private String name;
    private int marks;

	Student(int rollNo, String name, int marks) {
		this.rollNo = rollNo;
        this.name = name;
		this.marks = marks;
    }
	
	public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
	public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
}

class StudentMarksChecker{
    public static void main(String[] args) {
        Student student1 = new Student(1, "Sahil", 76);
		
		System.out.println("Student 1: RollNo= "+student1.getRollNo()+", Name= "+student1.getName()+", Marks="+student1.getMarks());		
    }
}
