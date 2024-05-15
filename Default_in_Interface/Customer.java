import java.util.List;
import java.util.Arrays;

/**
 * AfterSale
 */


public class Customer implements AfterSale {
    // this is common for both the Regular as well as the
    // privilaged customers,because any customer
    // will have a list of products,when he/she is buying sth
    private List<Product> products;

    // constructor
    Customer(List<Product> products) {
        this.products = products;
    }

    @Override
    public void chargeOnDelivery() {

        System.out.println("Every customer will be charged on delivery");
    }

    public double calculatePurchaseAmount() {

        double totalPrice = 0.0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;

    }
}


class Main {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(new Product(100), new Product(200));
        RegularCustomer rc = new RegularCustomer(products);
        PrivilegedCustomer pc = new PrivilegedCustomer(products);

        System.out.println("Regular Customer Total: " + rc.calculatePurchaseAmount());
        System.out.println("Privileged Customer Total: " + pc.discount(pc.calculatePurchaseAmount()));

    }
}