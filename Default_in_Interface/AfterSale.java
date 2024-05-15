import java.util.List;
import java.util.Arrays;
interface AfterSale {

    // this default method need not be overidden or
    /*
     * defined by every class implementing the interface
     * because this is anyhow a default method
     * that is the advantage of default over overriding(or other methods)
     */
    default double discount(double purchaseAmount) {
        return 0;
    }// No discount for regular customers

    // Methods declared in an interface, by default, are public and abstract
    void chargeOnDelivery(); // Normal public

}