public class Person {
    private String name;
    private int age;
    private String gender;

    private String nationality;

    // Constructor
    public Person(String name, int age, String gender, String nationality) {
        this.name = name;
        this.age = age;
        this.gender = gender;

        this.nationality = nationality;
    }

    // Method to check if the person can talk
    public void canTalk() {
        System.out.println(name + " can talk.");
    }

    // Method to check if the person can walk
    public void canWalk() {
        System.out.println(name + " can walk.");
    }

    // Method to check if the person can vote
    public boolean canVote() {
        if (age >= 18 && this.nationality.equalsIgnoreCase("Indian")) {
            return true;
        } else {
            return false;
        
    }

}

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }


    public String getNationality() {
        return nationality;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }



    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

}
