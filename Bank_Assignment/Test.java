package Bank_Assignment;

public class Test {
    public static void main(String[] args) {
        // testing
        // for savings account
        Savings Abhi = new Savings("AbhinavChandraMS", 20, 1000);
        Account john = new Account("john lennon", 40, 3500);
        Account Maudib = new Account("Maudib usul", 56, 4500);
        Savings Paul = new Savings("PaulMcartney", 81, 2000);
        Current Ringo = new Current("RingoStarr", 78, 3000);
        Current Shawn = new Current("Shawn Mendes", 28, 3000);

        // money transfer from Savings to account--->Working donne.
        // Abhi.transfer(500, john);
        // System.out.println(Abhi.checkBalance());
        // System.out.println(john.checkBalance());
        // Abhi.printTransactions();
        // System.out.println(john.no_Of_Transactions());
        // output:
        // The transfer is successfull.
        // 500.0
        // 4000.0
        // CheckedBalance: -1.0 at 2024-03-30T19:34:55.005621600
        // CheckedBalance: -1.0 at 2024-03-30T19:34:55.005621600
        // Withdraw: 500.0 at 2024-03-30T19:34:55.005621600
        // AbhinavChandraMS-->john lennon: 500.0 at 2024-03-30T19:34:55.019443300
        // CheckedBalance: -1.0 at 2024-03-30T19:34:55.019443300
        // 2

        // money transfer from account to account--->Working donne...
        // Maudib.transfer(500, john);
        // System.out.println(Maudib.checkBalance());
        // System.out.println(john.checkBalance());
        // System.out.println(john.no_Of_Transactions());
        // System.out.println(john.no_Of_Transactions());
        // output:
        // The transfer is successfull.
        // 4000.0
        // 4000.0
        // 2
        // 2

        // money transfer from Savings to current--->working donne...
        // Abhi.transfer(500, Ringo);
        // System.out.println(Abhi.checkBalance());
        // System.out.println(Ringo.checkBalance());
        // System.out.println();

        // Abhi.printTransactions();
        // System.out.println();
        // Ringo.printTransactions();

        // output
        // 500.0
        // 3500.0

        // CheckedBalance: -1.0 at 2024-03-30T20:06:06.712359--->for transferring
        // CheckedBalance: -1.0 at 2024-03-30T20:06:06.712359--->for withdrawing.
        // Withdraw: 500.0 at 2024-03-30T20:06:06.712359
        // AbhinavChandraMS-->RingoStarr: 500.0 at 2024-03-30T20:06:06.720360
        // CheckedBalance: -1.0 at 2024-03-30T20:06:06.720360

        // Deposit: 500.0 at 2024-03-30T20:06:06.712359
        // CheckedBalance: -1.0 at 2024-03-30T20:06:06.721370800

        // money transfer from Savings to Savings--->working perfectly fine.

        // Abhi.transfer(500, Paul);
        // System.out.println(Abhi.checkBalance());
        // System.out.println(Paul.checkBalance());
        // System.out.println();

        // Abhi.printTransactions();
        // System.out.println();
        // Paul.printTransactions();

        // output:
        // 500.0
        // 2500.0

        // CheckedBalance: -1.0 at 2024-03-30T20:13:21.811144300-->one for checking
        // wheather to
        // transfer or not
        // CheckedBalance: -1.0 at 2024-03-30T20:13:21.811144300-->one checking before
        // withdrawal.
        // Withdraw: 500.0 at 2024-03-30T20:13:21.811144300
        // AbhinavChandraMS-->PaulMcartney: 500.0 at 2024-03-30T20:13:21.821036100
        // CheckedBalance: -1.0 at 2024-03-30T20:13:21.821036100

        // Deposit: 500.0 at 2024-03-30T20:13:21.811144300
        // CheckedBalance: -1.0 at 2024-03-30T20:13:21.821036100

        // money transfer from Current to account

        // from current to account.--->working perfectly fine.
        // Ringo.transfer(500, john);
        // System.out.println(Ringo.checkBalance());
        // System.out.println(john.checkBalance());
        // Ringo.printTransactions();
        // System.out.println(john.no_Of_Transactions());
        // output:
        // The transfer is successfull.
        // 2500.0
        // 4000.0
        // CheckedBalance: -1.0 at 2024-03-30T21:21:49.322083200
        // CheckedBalance: -1.0 at 2024-03-30T21:21:49.322083200
        // Withdraw: 500.0 at 2024-03-30T21:21:49.322083200
        // RingoStarr-->john lennon: 500.0 at 2024-03-30T21:21:49.332829700
        // CheckedBalance: -1.0 at 2024-03-30T21:21:49.332829700
        // 2

        // money transfer from Current to current--->working perfectly fine.
        // Ringo.transfer(500, Shawn);
        // System.out.println(Ringo.checkBalance());
        // System.out.println(Shawn.checkBalance());
        // System.out.println();

        // Ringo.printTransactions();
        // System.out.println();
        // Shawn.printTransactions();

        // output:
        // 2500.0
        // 3500.0

        // CheckedBalance: -1.0 at 2024-03-30T21:26:43.532740900
        // CheckedBalance: -1.0 at 2024-03-30T21:26:43.532740900
        // Withdraw: 500.0 at 2024-03-30T21:26:43.532740900
        // RingoStarr-->Shawn Mendes: 500.0 at 2024-03-30T21:26:43.538749500
        // CheckedBalance: -1.0 at 2024-03-30T21:26:43.538749500

        // Deposit: 500.0 at 2024-03-30T21:26:43.532740900
        // CheckedBalance: -1.0 at 2024-03-30T21:26:43.539747400

        // money transfer from Current to Savings--->working perfectly fine.
        // Shawn.transfer(500, Paul);
        // System.out.println(Shawn.checkBalance());
        // System.out.println(Paul.checkBalance());
        // System.out.println();

        // Shawn.printTransactions();
        // System.out.println();
        // Paul.printTransactions();

        // expand of storing whoose whole transactions belong to whome? also next time.

        // output:
        // 2500.0
        // 2500.0

        // CheckedBalance: -1.0 at 2024-03-30T21:30:47.663547600
        // CheckedBalance: -1.0 at 2024-03-30T21:30:47.663547600
        // Withdraw: 500.0 at 2024-03-30T21:30:47.663547600
        // Shawn Mendes-->PaulMcartney: 500.0 at 2024-03-30T21:30:47.671062900
        // CheckedBalance: -1.0 at 2024-03-30T21:30:47.671062900

        // Deposit: 500.0 at 2024-03-30T21:30:47.663547600
        // CheckedBalance: -1.0 at 2024-03-30T21:30:47.671062900

        // System.out.println(Abhi.checkBalance());
        // output
        // 1000.0
        // Abhi.printTransactions();
        // output
        // 1000.0
        // CheckedBalance: -1.0 at 2024-03-30T17:26:21.467104300

        // can i transfer money from savings to current or from current to savings.
        // Abhi.setBalance(70000);
        // System.out.println(Abhi.checkBalance());
        // Abhi.printTransactions();
        // output
        // 70000.0
        // SetBalance: 70000.0 at 2024-03-30T17:30:40.457206300
        // CheckedBalance: -1.0 at 2024-03-30T17:30:40.457206300

    }
}