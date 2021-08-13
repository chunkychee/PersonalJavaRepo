import java.util.Scanner;

public class AccountSystem {

    public static void main(String[] args) {
        int inputOption;


        Scanner input = new Scanner(System.in);
        Account object = new Account();

        System.out.println("Please enter account name.");
        object.Name = input.next();

        do {
            System.out.println("Please enter a VALID account balance");
            object.inputBalance = input.nextLong();
        }
        while (object.inputBalance <= 0);

        do {
            System.out.println("""
                                        
                    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                     1.Account Status
                     2.Withdrawal
                     3.Deposits
                     99.Exit
                    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                     Please Select Above Option:
                    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~""");

            inputOption = input.nextInt();
            switch (inputOption) {
                case 1:
                    System.out.println("Dear " + object.getName()+ "," + "\n***************" + "\nCurrent Balance: " + object.getInputBalance() + "\n~~~~~~~~~~~~~~~");
                    break;

                case 2: //withdrawal
                    do {
                        System.out.println("Please enter a VALID amount you wish to withdraw.");
                        object.withdrawalAmt = input.nextLong();
                    }
                    while (object.withdrawalAmt < 1);
                    if (object.withdrawalAmt > object.getInputBalance()) {
                        System.out.println("insufficient balance to withdraw, please try again");
                    } else {
                        object.getWithdrawal();
                        System.out.println("your current bank balance is: " + object.getInputBalance());
                    }
                    break;

                case 3: //deposit
                    do {
                        System.out.println("Please enter a VALID amount you wish to deposit.");
                        object.depositAmt = input.nextLong();
                    }
                    while (object.depositAmt < 1);
                    object.getDeposit();
                    System.out.println("your current bank balance is " + object.getInputBalance());
                    break;

                case 99:
                    System.out.println("thanks for banking with us");
                    break;

                default:
                    System.out.println("invalid input! try again");
            }
        } while (inputOption != 99);
    }

}

