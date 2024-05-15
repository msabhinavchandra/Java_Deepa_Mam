package Bank_Assignment;

import java.util.ArrayList;
import java.util.List;

public class Current extends Account {
    private List<TransactionObj> transactions;//transactions in list of objects(transactions.)
    static int minimumBalance=800;

    String nameOfTheOrganization;
    //override account balance-->donne
    //and keep it to -1000-->donne
    //and set the limit to -1000--->donne
    //and keep this 1000 as an overdraft facility.--->donne

    public Current(){
        System.out.println("The overdraft facility for Current account is activated");
        setBalance(1000);
        //what will i do is
        //i will show when he tried to access more than 1k from
        //a zero account i will show insufficient funds--->donne
    }
    public Current(String accHolderName,int accNo,int balance){   
        super(accHolderName,accNo,balance);
        this.transactions=new ArrayList<>();//syntax 
        //you will get it by practice.
    }

    @Override
    public void withDraw(float amt){

        if(checkBalance()<minimumBalance){
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
        
            transactions.add(new TransactionObj("Deposit", amt));
            super.deposit(amt);
        
    }

    @Override
    public void setBalance(float amt){

            transactions.add(new TransactionObj("SetBalance", amt));

            super.setBalance(amt);
        
    }

    @Override
    public float checkBalance(){

        
            transactions.add(new TransactionObj("CheckedBalance", -1));
            return super.checkBalance();
    
    }
        //overloading for transfer of money.
    //money going from current to current.
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
    //from current to a savings account.
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
        if(checkBalance()<minimumBalance){
            transactions.add(new TransactionObj("FailedTransaction", -1));

            System.out.println("The account doesn't have minimum balance required to maintain this account.");
            return;
        }
        else{
            super.transfer(amt, to);
            transactions.add(new TransactionObj(this.accHolderName+"-->"+to.accHolderName,amt));
            return;
        }
    }

    public void printTransactions(){
        for(TransactionObj x:transactions){
            System.out.println(x.toString());
        }
    }








    //keep a higher minimum balance.--->donne



    
}
