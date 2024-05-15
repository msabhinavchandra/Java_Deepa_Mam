public class MasabTank extends Branch {
    public boolean validateAddressProof(String AddressProof){
        if(AddressProof.equalsIgnoreCase("electricity")){
         return true;
        }
        else {
        return false;
        }
}
    public boolean validatePhotoProof(String photoProof){
        if(photoProof.equalsIgnoreCase("passport")) {
        return true;
        }
        else {
        return false;
        }
    }
}
