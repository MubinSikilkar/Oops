public class Bank {
    public void depositMoney(double amountToAdd){
        double existingBalance=accountBalance;
        System.out.println("The existing balance is " +existingBalance);
        this.amountToAdd=amountToAdd;
        accountBalance = (accountBalance+ amountToAdd);
        System.out.println("Updated Account balance is " +accountBalance);}

    public void withdrawMoney(double amountToWithdraw){
        if(amountToWithdraw>accountBalance){
            System.out.println("Insufficent Balance");
        }else{
            this.amountToWithdraw=amountToWithdraw;
            accountBalance=(accountBalance-amountToWithdraw);
            System.out.println("Amount debited is " +amountToWithdraw+ "Remaining balance is "+accountBalance);


        }



    }

    private double accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmail;
    private double amountToAdd;
    private double amountToWithdraw;
    private double customerPhoneNumber;
    public void setAccountNumber(double accountNumber){
        this.accountNumber=accountNumber;
    }
    public void setAccountBalance( double accountBalance){
        this.accountBalance=accountBalance;
    }
    public void setCustomerName(String customerName){
        this.customerName=customerName;
    }
    public void setCustomerEmail(String customerEmail){
        this.customerEmail=customerEmail;
    }
    public double getAccountNumber(){

            return accountNumber;
        }
        public String getCustomerName(){
        if (customerName== ""){
            return "Empty customer name";
        }else{
            return customerName;
        }
    }
    public String getCustomerEmail(){
        if (customerEmail== ""){
            return "Empty customer Email";
        }else{
            return customerEmail;
        }
    }
    public double getCustomerPhoneNumber(){
        return customerPhoneNumber;
    }
    public double getAccountBalance(){
        return accountBalance;
    }





}
