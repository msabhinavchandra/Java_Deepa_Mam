/**
 * ContractEmployee
 */
public class ContractEmployee extends Employee {

    private double wages;
    private int hours;

    public ContractEmployee(String name,int empId,double wages,int hours){
        super(name,empId);
        this.wages=wages;
        this.hours=hours;
    }

    public double getWages() {
        return wages;
    }

    public void setWages(double wages) {
        this.wages = wages;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void calculateSalary()
    {
        System.out.print("Permanent Employee: Your salary is: "+hours*wages);
    }

}