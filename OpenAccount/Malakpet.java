public class Malakpet extends Branch {



    public boolean validateAddressProof(String AddressProof){
        if(AddressProof.equalsIgnoreCase("gasbill")){
         return true;
        }
        else{
         return false;
        }
}
    public boolean validatePhotoProof(String photoProof){
        if(photoProof.equalsIgnoreCase("aadhar")){
         return true;
        }
        else {
        return false;
        }
    }
}
