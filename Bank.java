public class Bank {
    private long accNumber;
    private String master;
    private int pin;
    private double balance;

    public Bank(long accNumber,String master,int pin,double balance){
        this.accNumber=accNumber;
        this.master=master;
        this.pin=pin;
        this.balance=balance;
    }
    public long getAccNumber(){
        return this.accNumber;

    }
    public String getMaster(){
        return this.master;
    }
    public double getBalance(){
        return this.balance;
    }
    public void credit(double amount){
        this.balance=balance+amount;
        System.out.println(this.accNumber+"Credited with " +amount+"Avl Blance: "+this.balance);
    }
    private boolean isValid(int pin){
        return this.pin==pin;

    }
    public boolean isLiable(double amount){
        return this.balance>amount;
    }
    public void debit(double amount,int pin){
        if(isLiable(amount)){
            if(isValid(pin)){
            this.balance=this.balance-amount;
            System.out.println(this.accNumber+"Debited with"+amount+"Aval Balance:"+this.balance);

        }
        else{
            System.out.println("insufficient balance!"+this.balance);
        }}
    }
    public void display(){
        System.out.println("Bank Account Details");
        System.out.println("Account Number:"+this.accNumber);
        System.out.println("Account holder"+this.master);
        System.out.println("Balance:"+this.balance);

    }
}


