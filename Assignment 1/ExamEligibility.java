import java.util.*;

class ExamEligibility {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter total classes held: ");
		int classheld = sc.nextInt();
		System.out.print("Enter classes attended: ");
		int classattended = sc.nextInt();
		if(classattended>=classheld*0.75){	
			System.out.println("Student is allowed to sit for the exam");
		} 
		else{
			System.out.println("Student is not allowed to sit for the exam");
		}
		
    }
}