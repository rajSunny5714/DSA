package BasicsJava;
public class AccDetails{
    private final int accountNo;
    private double balance;
    AccDetails(int accountNo){
        this.accountNo=accountNo;
    }
    public int getAccountNo(){
        return accountNo;
    }
    public void setBalance(double balance){
        if(balance>=0){
            this.balance=balance;
        }
    }
    public double getBalance(){
        return balance;
    }
    public static void main(String[] args){
        AccDetails b=new AccDetails(101);
        b.setBalance(5000);
        b.setBalance(-200);
        System.out.print("Account number: "+b.getAccountNo()+"\nBalance: "+b.getBalance());
    }
}