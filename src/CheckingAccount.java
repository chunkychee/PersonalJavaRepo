public class CheckingAccount{
    private String name;
    private int balance;
    private String id;
    private int newBalance;


    public CheckingAccount(String inputName, int inputBalance, String inputId){
        name = inputName;
        balance = inputBalance;
        id = inputId;
    }

    public int setBalance(int newBalance){
       balance = newBalance;
       return balance;
    }

    public int getBalance(){
        return this.balance;
    }
}

























//public class CheckingAccount{
//    private String name;
//    private int balance;
//
//    public CheckingAccount(String inputName, int inputBalance){
//        name = inputName;
//        balance = inputBalance;
//    }
//
//    private void addFunds(int fundsToAdd){
//        balance += fundsToAdd;
//    }
//
//    private void getInfo(){
//        System.out.println("This checking account belongs to " + name +". It has " + balance + " dollars in it.");
//        return sum;
//    }
//
//    public static void main(String[] args) {
//        CheckingAccount myAccount = new CheckingAccount("kik" , 90);
//        myAccount.addFunds(5));
//        System.out.println();
//    }
//
//}