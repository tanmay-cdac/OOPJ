import java.util.*;

class ShopDiscount {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter total purchase amount: ");
		float amount = sc.nextInt();
		
		if(amount<=1000){	
			System.out.println("Final cost: "+amount);
		} 
		else{
			System.out.println("Final cost after discount: "+(amount*0.9));
		}
		
    }
}