// ''''''''''''''''''''''''''''''

// class Student extends Person
// {   
//     int yr;
//     String Dept;
//     String sec;
//     double cg;

//     Student(){
//         // super(name,age,gender);

//         this.yr=0;
//         this.Dept="";
//         this.sec="";
//         this.cg=0;
//     }

//     Student(String name,int age,String gender,int yr,String Dept,String sec,double cg){
//         // super(name,age,gender);
//         this.yr=yr;
//         this.Dept=Dept;
//         this.sec=sec;
//         this.cg=cg;
//     }

//     void Postgraduate(){
//         if(this.cg>8.5){
//             System.out.println("eligible for Postgraduation");
//         }
//         else{
//             System.out.println("Not eligible for Postgraduation");
//         }
//     }


// }

public class Student extends Person {
    private int year;
    private char section;
    private double cgpa;
    private int[] noOfGrades;
    private double fees;

    // Instance initializer
    {
        // Initializing noOfGrades array with default values
        noOfGrades = new int[0];
    }

    // Constructor
    public Student(String name, int age, String gender, double weight, String nationality, int year, char section, double cgpa, int[] noOfGrades) {
        super(name, age, gender, weight, nationality);
        this.year = year;
        this.section = section;
        this.cgpa = cgpa;
        this.noOfGrades = noOfGrades;
        this.fees = calculateFees(year);
    }

    // Method to calculate fees based on the year
    private double calculateFees() {
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

    // Method to calculate percentage and update CGPA
    public void calculatePercentage() {
        int totalGrades = 0;
        int totalPoints = 0;

        // Calculate total number of grades and total points
        for (int grade : noOfGrades) {
            totalGrades += grade;
            totalPoints += grade * 10; // Assuming each grade contributes 10 points to the CGPA
        }

        // Calculate updated CGPA
        double updatedCgpa = (double) totalPoints / (totalGrades * 10); // Normalize to 10 scale

        // Update cgpa instance variable
        this.cgpa = updatedCgpa;
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
        return fees;
    }

    // Setter method for fees
    public void setFees(double fees) {
        this.fees = fees;
    }

    // Override canVote method
    @Override
    public void canVote() {
        // Implement voting eligibility criteria specific to students if needed
        // For simplicity, let's keep the canVote method as it was before
        super.canVote();
    }
}

class Run {
    public static void main(String[] args) {

        Person p1=new Person();
        Person p2=new Person();
        Student s=new Student("Abhinav",20,"M",2,"CSE","A",7.65);
        s.Postgraduate();
        // System.out.println(s.Dept+" "+s.name);



        // System.out.println("Hello 2024");
    }
}
