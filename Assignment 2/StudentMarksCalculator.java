class Student {
    private String name;
    private int marks;
    private static int totalStudents = 0;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
        
            totalStudents++;
    }

    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
	public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean isPassed() { 
		if(marks>=35){
			return true;
		}
		else{
			return false;
		}
    }
	
	public static int showTotalStudents(){
		return totalStudents;
	}
	
}

class StudentMarksCalculator{
    public static void main(String[] args) {
        Student student1 = new Student("Rahul", 78);
        Student student2 = new Student("Pooja", 34);
        Student student3 = new Student("Amit", 65);
		
		System.out.println("Student "+student1.getName()+" Passed? "+student1.isPassed());
        System.out.println("Student "+student2.getName()+" Passed? "+student2.isPassed());
        System.out.println("Student "+student3.getName()+" Passed? "+student3.isPassed());
		
		System.out.println("Total students: " + Student.showTotalStudents());
    }
}
