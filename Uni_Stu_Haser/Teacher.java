
public class Teacher extends Person {
    private String department;
    private String Position;

    // Teacher

    public Teacher(String name, char gender, int age, String department, String Position) {
        super(name, gender, age);
        this.department = department;
        this.Position = Position;
    }

    public String getPosition() {
        return Position;
    }

    public String getDepartment() {
        return department;
    }

    public void MarkAttendence(Student1 stu, boolean derOrNot) {

        stu.MarkAtt(derOrNot);

        System.out.println("The attendence of the student " + stu.getName() + " is " + stu.getIspresentOrNot());

    }

}

class Attendence {
    public static void main(String[] args) {

        Teacher Ayesha = new Teacher("Ayesha", 'F', 40, "Maths", "Hod");
        Student1 AbdVillers = new Student1("AbdeVillers", 'M', 21, "CSE");

        // Ayesha.MarkAttendence(AbdVillers, false);
        Ayesha.MarkAttendence(AbdVillers, true);

        // if(AbdVillers.getIspresentOrNot()){
        // System.out.println("Yes he/she is present");
        // }else{
        // System.out.println("Nope he/she is absent");
        // }
        // output:
        // The attendence of the student AbdeVillers is false
        // Nope he/she is absent

        if (AbdVillers.getIspresentOrNot()) {
            System.out.println("Yes he/she is present");
        } else {
            System.out.println("Nope he/she is absent");
        }

        // output:
        // The attendence of the student AbdeVillers is true
        // Yes he/she is present

    }// end of main
}// end of class