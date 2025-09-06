class TemperatureSensor{
    private int temperature;
	
    public void setTemperature(int t) {
        if(t>=0 && t<=100){
			temperature = t;
		}
		else{
			System.out.println("Temperature out of range");
		}
    }
	
    public int getTemperature() {
        return temperature;
    }
}

public class Temperature {
    public static void main(String[] args) {
        TemperatureSensor ts = new TemperatureSensor();
        ts.setTemperature(-5);
        System.out.println("Temperature = " + ts.getTemperature());
    }
}
