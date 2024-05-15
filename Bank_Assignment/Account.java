package Bank_Assignment;
class Account {
    private int accNo;
    String accHolderName;
    private float balance;
    private int no_of_transactions;

    Account(){
        this.accHolderName = "";
        this.accNo = -1;
        this.balance = 0;
        this.no_of_transactions = 0;
        
    }

    Account(String accHolderName, int accNo, int balance) {
        this.accHolderName = accHolderName;
        this.accNo = accNo;
        this.balance = balance;
        this.no_of_transactions = 0;
    }

    int no_Of_Transactions() {
        return this.no_of_transactions;
    }

    void incrementTransaction(){
        this.no_of_transactions+=1;
    }

    void withDraw(float amt) {
        if (amt > this.balance) {
            System.out.println("Insufficient Funds");
            no_of_transactions += 1;
            return;
        }
        this.balance -= amt;
        this.no_of_transactions += 1;
        return;

    }

    void deposit(float amt) {
        balance += amt;
        no_of_transactions += 1;

    }

    void setBalance(float amt) {
        balance = amt;
        no_of_transactions += 1;

    }

    float checkBalance() {
        no_of_transactions += 1;
        return balance;
    }

    void transfer(int amt,Account to)
    {   
        this.withDraw(amt);
        to.deposit(amt);
        System.out.println("The transfer is successfull.");
        no_of_transactions += 1;
    }

}// class ends

// class Bank {
//     public static void main(String[] args) throws Exception {
//         // System.out.println("Hello, World!");
//         Account a1 = new Account("virat", 1, 1000);
//         Account a2 = new Account("Rohit", 2, 2000);
//         Account a3 = new Account("Jadeja", 3, 1500);
//         Account a4 = new Account("Ravi", 4, 2500);
//         Account a5 = new Account("Root", 5, 3000);
//         Account a6 = new Account("Kane", 6, 3500);

//         System.out.println("For the account " + a1.accHolderName + "Balance is " +
//                 a1.checkBalance());
//         System.out.println("For the account " + a2.accHolderName + "Balance is " +
//                 a2.checkBalance());
//         System.out.println("For the account " + a3.accHolderName + "Balance is " +
//                 a3.checkBalance());
//         System.out.println("For the account " + a4.accHolderName + "Balance is " +
//                 a4.checkBalance());
//         System.out.println("For the account " + a5.accHolderName + "Balance is " +
//                 a5.checkBalance());
//         System.out.println("For the account " + a6.accHolderName + "Balance is " +
//                 a6.checkBalance());

//         a1.deposit(1000);

//         System.out.println("The number of transactions: " + a1.no_Of_Transactions());

//     }
// }

// lift your chin up and say
// u deserved better :)
