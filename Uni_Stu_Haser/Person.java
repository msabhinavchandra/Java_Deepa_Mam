public class Person{
    private String name;
    private char gender;
    private int age;

    public Person(String name,char gender,int age){
        this.name=name;
        this.gender=gender;
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }
    public String getName() {
        return name;
    }
}
