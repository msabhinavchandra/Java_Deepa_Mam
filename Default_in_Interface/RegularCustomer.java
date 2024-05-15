import java.util.List;
import java.util.Arrays;

public class RegularCustomer extends Customer {
    // writing the constructor,for the regular customer
    // with the help of the super keyword,by utilizing the
    // constructor of the parent class
    RegularCustomer(List<Product> products) {
        super(products);
    }

    /*
     * Because this is a method from the interface
     * which is not default as my parent is implementing Aftersale
     * interface, i need to define this to use this interface(implementation)
     * which is overriding in this case.
     */
    @Override
    public void chargeOnDelivery() {

        System.out.println("Delivery Charges Applied.");

    };

}