public class Customer {

    private int customerId;
    private long mobileNumber;
    private final String customer_name;
    private String customer_Address;
    
    
    
    int getCustomerId(){
        return  customerId;
    }
    long getMobileNumber(){
        return mobileNumber;
    }
    String getCustomer_name(){
        return customer_name;
    }
    String getCustomer_Address(){
        return customer_Address;
    }
    
    void setCustomer_Address(String address){
        this.customer_Address=address;
    }
    
    Customer(int id,String name,long mobileNumber){
        this.customerId=id;
        this.customer_name=name;
        this.mobileNumber=mobileNumber;
    }
    Customer(){
        customer_name=null;
    }
    Customer(int id,String name,long number,String address){
        this.customerId=id;
        this.customer_name=name;
        this.mobileNumber=number;
        setCustomer_Address(address);
    }
    
    
    
    
    

}
