package Bank_Assignment;
import java.util.ArrayList;
import java.util.List;


public class Savings extends Account {

    private List<TransactionObj> transactions;//transactions in list of objects(transactions.)
    static int minimumBalance=200;
    static float rateOfInterest=0.14f;
    //i am giving 14 percent interest every year.
    static int noofTimesAppliedPerYear=1;
    double finalAmount;

    float principal;

    //a constructor for the Savings account.
    public Savings(String accHolderName,int accNo,int balance){   
        super(accHolderName,accNo,balance);
        this.transactions=new ArrayList<>();//syntax 
        //you will get it by practice.
    }

    // int time;
    //this is the 1 metric i have to check every other
    // object which is about to be created in this savings account.

    //maintain interest and keep on adding it to the --->donne.
    //principal according to the time factor.

    //limit the number of transactions per day/month.--->donne.

    //lower minimum balance compared to curr--->donne.

    // make that option where you deposit money--->donne.
    //after the account creation also 
    //better to write a metnod on it too.

    //for flexibility purpose i will limit the no of transactions to--->donne.
    //5 a day
    //will override everysingle method.--->donne.
    Account to;
    //give the time in years format.
    void completeWithdrawal(float time)
    {
        principal=this.checkBalance();
        finalAmount=principal*Math.pow(1+(rateOfInterest/noofTimesAppliedPerYear),(noofTimesAppliedPerYear*time));
        transactions.add(new TransactionObj("CompleteWithdrawal", finalAmount));
        setBalance(0);
        this.incrementTransaction();

    }
    @Override
    public void withDraw(float amt){
        if(no_Of_Transactions()>5){
            System.out.println("The maximum no of transactions per day are exceeded");
        transactions.add(new TransactionObj("FailedTransaction", -1));

            return;
        }
        else if(checkBalance()<minimumBalance){
            System.out.println("The account doesn't have minimum balance required to maintain this account.");
        transactions.add(new TransactionObj("FailedTransaction", -1));

        }
        else{
            transactions.add(new TransactionObj("Withdraw", amt));
            super.withDraw(amt);
        }
    }

    @Override
    public void deposit(float amt){
        if(this.no_Of_Transactions()>5){
            System.out.println("The maximum no of transactions per day are exceeded");
            transactions.add(new TransactionObj("FailedTransaction", -1));

            return;
        }
        else{
            transactions.add(new TransactionObj("Deposit", amt));
            super.deposit(amt);
        }
    }

    @Override
    public void setBalance(float amt){
        if(this.no_Of_Transactions()>5){
            transactions.add(new TransactionObj("FailedTransaction", -1));

            System.out.println("The maximum no of transactions per day are exceeded");
            return;
        }
        else{
            transactions.add(new TransactionObj("SetBalance", amt));

            super.setBalance(amt);
        }
    }

    @Override
    public float checkBalance(){
        if(this.no_Of_Transactions()>5){
            System.out.println("The maximum no of transactions per day are exceeded");
            transactions.add(new TransactionObj("FailedTransaction", -1));
            return -1;
        }
        // else if(checkBalance()<minimumBalance){
        //     transactions.add(new TransactionObj("FailedTransaction", -1));

        //     System.out.println("The account doesn't have minimum balance required to maintain this account.");
        //     return -1;
        // }
        else{
            transactions.add(new TransactionObj("CheckedBalance", -1));
            return super.checkBalance();
        }
    }
    //overloading for transfer of money.
    //money going from savings to current.
    public void transfer(int amt,Current to){
        if(this.no_Of_Transactions()>5){
            transactions.add(new TransactionObj("FailedTransaction", -1));

            System.out.println("The maximum no of transactions per day are exceeded");
            return;
        }
        else if(checkBalance()<minimumBalance){
            transactions.add(new TransactionObj("FailedTransaction", -1));

            System.out.println("The account doesn't have minimum balance required to maintain this account.");
            return;
        }
        else{
            this.withDraw(amt);
            to.deposit(amt);
            transactions.add(new TransactionObj(this.accHolderName+"-->"+to.accHolderName,amt));
            //write a method to tranfer
            //sav->acc
            //sav->sav
            //sav->curr
            //vice versa for curr.

            return;
        }
    }
    //from savings to a savings account.
    public void transfer(int amt,Savings to){
        if(this.no_Of_Transactions()>5){
            transactions.add(new TransactionObj("FailedTransaction", -1));

            System.out.println("The maximum no of transactions per day are exceeded");
            return;
        }
        else if(checkBalance()<minimumBalance){
            transactions.add(new TransactionObj("FailedTransaction", -1));

            System.out.println("The account doesn't have minimum balance required to maintain this account.");
            return;
        }
        else{
            this.withDraw(amt);
            to.deposit(amt);
            transactions.add(new TransactionObj(this.accHolderName+"-->"+to.accHolderName,amt));
            //write a method to tranfer
            //sav->acc--donne
            //sav->sav-->donne
            //sav->curr-->donne
            //vice versa for curr.

            return;
        }
    }


    @Override
    public void transfer(int amt,Account to){
        if(this.no_Of_Transactions()>5){
            transactions.add(new TransactionObj("FailedTransaction", -1));

            System.out.println("The maximum no of transactions per day are exceeded");
            return;
        }
        else if(checkBalance()<minimumBalance){
            transactions.add(new TransactionObj("FailedTransaction", -1));

            System.out.println("The account doesn't have minimum balance required to maintain this account.");
            return;
        }
        else{
            super.transfer(amt, to);
            transactions.add(new TransactionObj(this.accHolderName+"-->"+to.accHolderName,amt));
            //write a method to tranfer
            //sav->acc
            //sav->sav
            //sav->curr
            //vice versa for curr.

            return;
        }
    }

    public void printTransactions(){
        for(TransactionObj x:transactions){
            System.out.println(x.toString());
        }
    }

    }//end of savings class.





    

