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
	public String calculateGrade(){
		if(marks>=80){
			return "A";
		}
		else if(marks>=60){
			return "B";
		}
		else if(marks>=40){
			return "C";
		}
		else{
			return "Fail";
		}
	}
}

class StudentGradeCalculator{
    public static void main(String[] args) {
        Student student1 = new Student(1, "Sahil", 76);
		Student student2 = new Student(2, "Abhishek", 86);
		System.out.println("Student 1: RollNo= "+student1.getRollNo()+", Name= "+student1.getName()+", Marks="+student1.getMarks()+", Grade="+student1.calculateGrade());		
		System.out.println("Student 2: RollNo= "+student2.getRollNo()+", Name= "+student2.getName()+", Marks="+student2.getMarks()+", Grade="+student2.calculateGrade());
	}
}
