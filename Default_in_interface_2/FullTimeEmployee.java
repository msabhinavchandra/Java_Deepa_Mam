public class FullTimeEmployee extends Employee implements Remunerator  {
    public double calculatePay() {
        // Calculate full-time employee's salary

        //this is how i call and use a method from the parent class
        return super.getEmployeeSalary()*0.95;
        
    }
    // Inherits deductForPension() from Remunerator
}

class Main {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee();

        double fullTimePensionDeduction = fullTimeEmployee.deductForPension(50000); // Assuming salary is 50000
        double partTimePensionDeduction = partTimeEmployee.deductForPension(50000); // Assuming salary is 25000

        System.out.println("Full-time employee pension deduction: $" + fullTimePensionDeduction);
        System.out.println("Part-time employee pension deduction: $" + partTimePensionDeduction);
    }
}