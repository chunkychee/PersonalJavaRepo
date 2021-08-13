public class Account {

    public long withdrawalAmt;
    public long depositAmt;
    public long inputBalance;
    public String Name;

    public long getInputBalance(){
        return inputBalance;
    }

    public String getName(){
        return Name;
    }

    public long getWithdrawal(){
        return inputBalance = inputBalance - withdrawalAmt;
    }

    public long getDeposit(){
        return inputBalance = inputBalance + depositAmt;
    }

}