import java.util.*;

class Grade {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter percentage marks: ");
		int marks = sc.nextInt();
		if(marks>=90){	
			System.out.println("Grade: A+");
		} 
		else if(marks>75 && marks<90){
			System.out.println("Grade: A");
		}
		else if(marks>65 && marks<=75){
			System.out.println("Grade: B+");
		}
		else if(marks>50 && marks<=65){
			System.out.println("Grade: B");
		}
		else if(marks>35 && marks<=50){
			System.out.println("Grade: C");
		}
		else{
			System.out.println("Grade: Fail");
		}
    }
}