public class TeamEventRegistration extends EventRegistration {
    private int noOfParticipants;
    private int teamNo;

    TeamEventRegistration(String name,String nameOfEvent,int noOfParticipants,int teamNo)
    {
        super(name,nameOfEvent);
        this.noOfParticipants=noOfParticipants;
        this.teamNo=teamNo;
    }

    public int getNoOfParticipants() {
        return noOfParticipants;
    }

    public void setNoOfParticipants(int noOfParticipants) {
        this.noOfParticipants = noOfParticipants;
    }

    public int getTeamNo() {
        return teamNo;
    }

    public void setTeamNo(int teamNo) {
        this.teamNo = teamNo;
    }

    @Override
    public void registerEvent(){

        if (this.nameOfEvent == "ShakeALeg") {
            this.registrationFee = 50.0;
        } else if (this.nameOfEvent == "Sing&Win") {
            this.registrationFee = 60.0;
        } else if (this.nameOfEvent == "Actathon") {
            this.registrationFee = 80.0;
        } else if (this.nameOfEvent == "PlayAway") {
            this.registrationFee = 100.0;
        }
        else{
            System.out.println("Please choose a valid event.");
            return;
        }

        this.registrationFee=this.registrationFee*this.noOfParticipants;

        System.out.println(
            "Thank You " + this.name + " for your participation.Your registration fee is: " + this.registrationFee);

            System.out.println("Your team no: "+this.teamNo);

    }
}


