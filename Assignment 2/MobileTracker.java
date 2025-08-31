class Mobile{
	String model;
	static int totalMobiles=0;
	
	Mobile(String model){
	this.model = model;
	totalMobiles++;
	}
	
	String getModel(){
			return model;
	}
	
	static int showTotalMobiles(){
		return totalMobiles;
	}
	
}

class MobileTracker{
    public static void main(String[] args) {
        Mobile mobile1 = new Mobile("Samsung Galaxy M12");
        Mobile mobile2 = new Mobile("Redmi Note 12");
       
		System.out.println("Mobile1 model: " + mobile1.getModel());
        System.out.println("Mobile2 model: " + mobile2.getModel());
        
		
		System.out.println("Total mobiles in stock: " + Mobile.showTotalMobiles());
    }
}
