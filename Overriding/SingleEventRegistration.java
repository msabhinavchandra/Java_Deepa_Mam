public class SingleEventRegistration extends EventRegistration {
    private int participantNo;
    SingleEventRegistration(String name,String nameOfEvent,int participantNo)
    {
        super(name,nameOfEvent);
        this.participantNo=participantNo;
    }

    public int getParticipantNo() {
        return participantNo;
    }

    public void setParticipantNo(int participantNo) {
        this.participantNo = participantNo;
    }

    @Override
    public void registerEvent(){
        super.registerEvent();
        if(this.counter==-1){
            return;
        }
        System.out.println(
    "Thank You " + this.name + " for your participation.Your registration fee is: " + this.registrationFee);
        System.out.println("You are participant no: "+this.participantNo);
    }

}
