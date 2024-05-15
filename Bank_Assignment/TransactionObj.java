package Bank_Assignment;

import java.time.LocalDateTime;

public class TransactionObj {

    private String type;
    private double amount;
    private LocalDateTime dateTime;

    public TransactionObj(String type,double amount){
        this.type=type;
        this.amount=amount;
        this.dateTime=LocalDateTime.now();
    }

    public String toString(){
        return type + ": "+amount+" at "+dateTime;
    }
    
}
