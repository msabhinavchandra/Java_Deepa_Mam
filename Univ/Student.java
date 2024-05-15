public class Student extends Person {
    private int year;

    private double cgpa;

    private double fees;

    

    // Constructor
    public Student(String name, int age, String gender, String nationality, int year, double cgpa) {
        super(name, age, gender, nationality);
        this.year = year;
    
        this.cgpa = cgpa;
      
        this.fees = calculateFees(year);
    }

    // Method to calculate fees based on the year
    private double calculateFees(int year) {
        switch (year) {
            case 1:
                return 20000;
            case 2:
                return 30000;
            case 3:
                return 40000;
            case 4:
                return 35000;
            default:
                return 0; // No fees for other years
        }
    }


    // Method to check eligibility for applying to postgraduate program
    public boolean applyForPostGraduate() {
        if (year == 4 && cgpa > 8.0) {
            return true;
        }
        return false;
    }

    // Getter method for fees
    public double getFees() {
        return this.fees;
    }

    public void calculateCgpa(){
        System.out.println(this.cgpa);
    }

    // Setter method for fees
    public void setFees(double fees) {
        this.fees = fees;
    }

    public void Payfee(int amt){
        this.fees-=amt;
    }

    boolean fullFeePaidOrNot(){
        if (this.fees==0){
            return true;
        }
        else{
            return false;
        }
    }

    // Override canVote method
    @Override
    public boolean canVote() {
        // Implement voting eligibility criteria specific to students if needed
        // For simplicity, let's keep the canVote method as it was before
        if(fullFeePaidOrNot() && super.canVote()){
        return true;
        }
        if(!fullFeePaidOrNot() && super.canVote()==true){
            System.out.println("Pay full fees to vote");
            return false;
        }
            return false;
     
        // super.canVote();
        // return canVote();
    }

    public boolean isEligibleForScholarship(){
        if(this.cgpa>9.0)
        {
            this.fees=this.fees/2;
            System.out.println("Fee is halved");
            return true;
        }
        return false;
    }

}

