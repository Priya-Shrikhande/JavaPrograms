package Thread.synchronization.bank;
public class Account {
    private int balance=10000;
    
    public boolean isSufficientBalance(int amount){
        if(balance<amount)
            return false;
        else
            return true;
    }
    
    public void withdraw(int amount){
        balance=balance-amount;
        System.out.println("remaining balance is INR : "+balance);
    
    }
}
