


public class PartTimeEmployee extends Employee implements Remunerator  {
    public double calculatePay() {
        // Calculate part-time employee's salary

//this is how i call and use the parent class
        return super.getEmployeeSalary()*0.95;
    }
    // Inherits deductForPension() from Remunerator
}
