import java.util.List;
import java.util.Arrays;

public class PrivilegedCustomer extends Customer {

    PrivilegedCustomer(List<Product> products) {
        super(products);
    }

    /*
     * Because this is a method from the interface
     * which is not default as my parent is implementing Aftersale
     * interface, i need to define this to use this interface(implementation)
     * which is overriding in this case.
     */

    // All the methods i have defined in the interface are public by default
    // so even the default method are also public too.
    @Override
    public double discount(double purchaseAmount) {
        return purchaseAmount * 0.95; // 5% discount
    }// will return the discounted amount.
     // i need not override this method again in the regular customer,
     // because i won't be needing any changes from the exisiting discount method.

    // Methods declared in an interface, by default, are public and abstract
    @Override
    public void chargeOnDelivery() {

        System.out.println("Reduced charge on delivery For Privileged Customers");

    };

}