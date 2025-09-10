public class PaymentProcessing {
    public static void main(String[] args) {
        try{
            throw new Exception("Exception occurred: Payment Failed");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Cleanup done");
        }
    }
}
