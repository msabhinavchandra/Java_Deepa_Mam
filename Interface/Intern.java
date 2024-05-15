import java.util.Scanner;

interface DataProvider {
    double calcPercentage();
}

class Intern implements DataProvider {
    private int marksSecured;
    private int graceMarks;

    // constructor
    public Intern(int marksSecured, int graceMarks) {
        this.marksSecured = marksSecured;
        this.graceMarks = graceMarks;
    }

    // the interface is giving me the functionality of calcPercentage
    // which i am overriding in my own class
    // as every interface method has to be overidden inside our own class
    // which we are using to implement our own interface.
    @Override
    public double calcPercentage() {
        int totalMarks = marksSecured + graceMarks;
        double percentage = ((double) totalMarks / 8000) * 100;
        // explicit conversion of int to double.
        return percentage;
    }
}

class Trainee implements DataProvider {
    private int marksSecured;

    // constructor.
    public Trainee(int marksSecured) {
        this.marksSecured = marksSecured;
    }

    // the interface is giving me the functionality of calcPercentage
    // which i am overriding in my own class
    // as every interface method has to be overidden inside our own class
    // which we are using to implement our own interface.
    @Override
    public double calcPercentage() {
        double percentage = ((double) marksSecured / 8000) * 100;
        return percentage;
    }
}

// main method where we are using the above classes and interfaces.
public class Main {
    public static void main(String[] args) {
        // this is for taking the input from the user.
        Scanner scanner = new Scanner(System.in);

        //for intern
        boolean validInternInput = false;
        int internMarks = 0;
        int internGraceMarks = 0;
        while (!validInternInput) {
            System.out.println("Enter marks secured for Intern:");
            internMarks = scanner.nextInt();
            System.out.println("Enter grace marks for Intern:");
            internGraceMarks = scanner.nextInt();
            if (internMarks + internGraceMarks <= 8000) {
                validInternInput = true;
            } else {
                System.out.println("Please enter the correct marks.");
            }
        }
        Intern intern = new Intern(internMarks, internGraceMarks);
        double internPercentage = intern.calcPercentage();
        System.out.println("Intern: the total aggregate percentage secured is " + internPercentage);

        // For Trainee
        boolean validTraineeInput = false;
        int traineeMarks = 0;
        while (!validTraineeInput) {
            System.out.println("Enter marks secured for Trainee:");
            traineeMarks = scanner.nextInt();
            if (traineeMarks <= 8000) {
                validTraineeInput = true;
            } else {
                System.out.println("Please enter the correct marks.");
            }
        }
        Trainee trainee = new Trainee(traineeMarks);
        double traineePercentage = trainee.calcPercentage();
        System.out.println("Trainee: the total aggregate percentage secured is " + traineePercentage);

        // Close the scanner
        scanner.close();
    }
}
