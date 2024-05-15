public abstract class Branch {
    //because these proofs are different for different branches.
    abstract public boolean validatePhotoProof(String proof);
    abstract public boolean validateAddressProof(String proof);

    //but the common thing is minimum balance should be the same for opening
    //account in both the branched.

    //common method which is shared by both the branches or any number of branches.
    public void openAccount(String photoProof,String AddressProof,int amt){
        if(validatePhotoProof(photoProof) && validateAddressProof(AddressProof) && amt>=1000){
            System.out.println("Account opened.");
        }
        else{
            System.out.println("Cannot open Account.");
        }
    }    
    
}
