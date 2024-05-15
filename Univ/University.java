public class University {
    public static void main(String[] args) {
        Student Pragnya = new Student("Pragnya", 21, "Female", "Indian", 3, 8.9);
        Student Sameul = new Student("Sameul", 20, "male", "African", 2, 7.2);
        Student Tikku = new Student("Tikku", 22, "male", "Indian", 4, 9.2);
        Student Pankaj = new Student("Pankaj", 22, "male", "Indonesian", 4, 8.8);
        Student Jim = new Student("Jim", 21, "male", "Canadian", 3, 8.9);
        Student Seema = new Student("Seema", 22, "Female", "Indian", 4, 9.9);

        // System.out.println(Pragnya.getFees());
        // output:
        // 40000.0
        Pragnya.Payfee(30000);
        if (Pragnya.canVote()) {
            System.out.println("Yes Pragnya can vote.");
        } else {
            System.out.println("No Pragnya can't vote.");
        }

        // output:
        // Pay full fees to vote
        // No Pragnya can't vote.

        

        // Pragnya.calculateCgpa();
        // Sameul.calculateCgpa();
        // Tikku.calculateCgpa();
        // Pankaj.calculateCgpa();
        // Jim.calculateCgpa();
        // Seema.calculateCgpa();

        // output:
        // 8.9
        // 7.2
        // 9.2
        // 8.8
        // 8.9
        // 9.9

        // if (Pragnya.applyForPostGraduate()) {
        // System.out.println("Eligible for postgraduation.");
        // } else {
        // System.out.println("Not eligible for postgraduation.");
        // }
        // if (Sameul.applyForPostGraduate()) {
        // System.out.println("Eligible for postgraduation.");
        // } else {
        // System.out.println("Not eligible for postgraduation.");
        // }
        // if (Tikku.applyForPostGraduate()) {
        // System.out.println("Eligible for postgraduation.");
        // } else {
        // System.out.println("Not eligible for postgraduation.");
        // }
        // if (Pankaj.applyForPostGraduate()) {
        // System.out.println("Eligible for postgraduation.");
        // } else {
        // System.out.println("Not eligible for postgraduation.");
        // }
        // if (Jim.applyForPostGraduate()) {
        // System.out.println("Eligible for postgraduation.");
        // } else {
        // System.out.println("Not eligible for postgraduation.");
        // }
        // if (Seema.applyForPostGraduate()) {
        // System.out.println("Eligible for postgraduation.");
        // } else {
        // System.out.println("Not eligible for postgraduation.");
        // }

        // output:
        // Not eligible for postgraduation.
        // Not eligible for postgraduation.
        // Eligible for postgraduation.
        // Eligible for postgraduation.
        // Not eligible for postgraduation.
        // Eligible for postgraduation.

        // Pragnya.calculateCgpa();
        // output:
        // 40000.0

        // if(Pragnya.isEligibleForScholarship()){
        // System.out.println("Yes eligible for scholarship");
        // }
        // else{
        // System.out.println("Not eligible for the scholarship");
        // }
        // output:
        // Not eligible for the scholarship
        // if(Sameul.isEligibleForScholarship()){
        // System.out.println("Yes eligible for scholarship");
        // }
        // else{
        // System.out.println("Not eligible for the scholarship");
        // }
        // output:
        // Not eligible for the scholarship
        // if(Tikku.isEligibleForScholarship()){
        // System.out.println("Yes eligible for scholarship");
        // }
        // else{
        // System.out.println("Not eligible for the scholarship");
        // }
        // output:
        // Fee is halved
        // Yes eligible for scholarship
        // if (Pankaj.isEligibleForScholarship()) {
        // System.out.println("Yes eligible for scholarship");
        // } else {
        // System.out.println("Not eligible for the scholarship");
        // }
        // output:
        // Not eligible for the scholarship
        // if (Jim.isEligibleForScholarship()) {
        // System.out.println("Yes eligible for scholarship");
        // } else {
        // System.out.println("Not eligible for the scholarship");
        // }
        // output:
        // Not eligible for the scholarship
        // if (Seema.isEligibleForScholarship()) {
        // System.out.println("Yes eligible for scholarship");
        // } else {
        // System.out.println("Not eligible for the scholarship");
        // }
        // output:
        // Fee is halved
        // Yes eligible for scholarship

        // output:calculated fees.
        // 30000.0
        // 35000.0
        // 35000.0
        // 40000.0
        // 35000.0

    }
}