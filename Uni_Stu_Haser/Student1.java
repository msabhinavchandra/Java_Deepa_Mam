public class Student1 extends Person{
    private String Branch;
    private boolean Ispresent;

    public boolean getIspresentOrNot(){
        return this.Ispresent;
    }

    public Student1(String name,char gender,int age,String Branch){
        super(name, gender, age);
        this.Branch=Branch;
    }

    public void MarkAtt(boolean status){
        this.Ispresent=status;
    }


    public String getBranch() {
        return Branch;
    }
}