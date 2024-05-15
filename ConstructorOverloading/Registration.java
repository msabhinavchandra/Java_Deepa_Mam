public class Registration {

    private String customerName;
    private String panCardNo;
    private int voterId;
    private String passportNo;
    private int licensenNo;
    private long[] telephoneNo;

    Registration(String customerName,String passportNo,long[] telephoneNo)
    {
        this.customerName=customerName;
        this.passportNo=passportNo;
        this.telephoneNo=telephoneNo;

        System.out.println("Congragulations "+this.customerName +"!!! "+"you have been successfully registered for our services with the following details:");
        System.out.println("Passport number: " + this.passportNo);
        System.out.println("Phone numbers: "+ this.telephoneNo[0]+ " "+this.telephoneNo[1]);

    }

    Registration(String customerName,int liscNo,String panCNo,long[] telephoneNo)
    {
        this.customerName=customerName;
        this.licensenNo=liscNo;
        this.panCardNo=panCNo;
        this.telephoneNo=telephoneNo;

        System.out.println("Congragulations "+this.customerName +"!!! "+"you have been successfully registered for our services with the following details:");
        System.out.println("License number: "+this.licensenNo);
        System.out.println("Pan Card number: " + this.panCardNo);
        System.out.println("Phone numbers: "+ this.telephoneNo[0]+ " "+this.telephoneNo[1]);

    }

    Registration(String customerName,int Votrid,int licensenNo,long[] telephoneNo)
    {
        this.customerName=customerName;
        this.voterId=Votrid;
        this.licensenNo=licensenNo;
        this.telephoneNo=telephoneNo;

        System.out.println("Congragulations "+this.customerName +"!!! "+"you have been successfully registered for our services with the following details:");
        System.out.println("VoterId: "+this.voterId);
        System.out.println("License Number: " + this.licensenNo);
        System.out.println("Phone numbers: "+ this.telephoneNo[0]+ " "+this.telephoneNo[1]);

    }

    Registration(String customerName,String panCardNo,int votedId,long[] telephoneNo)
    {
        this.customerName=customerName;
        this.panCardNo=panCardNo;
        this.voterId=votedId;
        this.telephoneNo=telephoneNo;

        System.out.println("Congragulations "+this.customerName +"!!! "+"you have been successfully registered for our services with the following details:");
        System.out.println("Pan Card Number: "+this.panCardNo);
        System.out.println("Voter id: " + this.voterId);
        System.out.println("Phone numbers: "+ this.telephoneNo[0]+ " "+this.telephoneNo[1]);

    }



    void getCustomerName(){
        System.out.println("The name of the customer is "+customerName);
    }

    void getPanCardNo(){
        System.out.println("The PanCard Number of the customer is "+panCardNo);
    }

    void getVoterId(){
        System.out.println("The voterId of the customer is "+voterId);
    }

    void getPassportNo(){
        System.out.println("The passPortno of the customer is "+ passportNo);
    }

    void getLicenseNo(){
        System.out.println("The LicenseNo of the customer is " + licensenNo);
    }

    void gettelephone(){
        if(telephoneNo!=null && telephoneNo.length>=2){

        System.out.println("The telephoneNos of the customer are " + telephoneNo[0]+" "+telephoneNo[1]);
        }
        else{
            System.out.println("Telephone numbers not available.");
        }
    }
    
}
