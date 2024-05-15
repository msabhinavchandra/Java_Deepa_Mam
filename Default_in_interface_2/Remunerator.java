public interface Remunerator {
    double calculatePay();

    // Default method added directly in the interface
    default double deductForPension(double employeeSalary) {
        final double PENSION_PERCENTAGE = 5.0;
        return employeeSalary * PENSION_PERCENTAGE / 100;
    }
}

