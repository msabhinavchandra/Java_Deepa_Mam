import java.security.PublicKey;

public class Permanent extends Employee {

    private double basicPay;
    private double hra;
    private int experience;

    public Permanent(String name, int empId, double basicPay, double hra, int exp) {
        super(name, empId);
        this.basicPay = basicPay;
        this.hra = hra;
        this.experience = exp;
    }

    public double getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }

    public double getHra() {
        return hra;
    }

    public void setHra(double hra) {
        this.hra = hra;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void calculateSalary() {
        System.out.print("Permanent Employee: Your salary is: ");
        if (this.experience < 3) {
            super.setSalary(basicPay+hra);
            System.out.println(basicPay + hra);
        } else if (this.experience >= 3 && this.experience < 5) {
            super.setSalary(basicPay + basicPay * (5.0 / 100.0) + hra);
            System.out.println(basicPay + basicPay * (5.0 / 100.0) + hra);
        } else if (this.experience >= 3 && this.experience < 10) {
            super.setSalary(basicPay + basicPay * (7.0 / 100.0) + hra);
            System.out.println(basicPay + basicPay * (7.0 / 100.0) + hra);
        } else if (this.experience >= 10) {
            super.setSalary(basicPay + basicPay * (12.0 / 100.0) + hra);
            System.out.println(basicPay + basicPay * (12.0 / 100.0) + hra);
        }
    }
}

