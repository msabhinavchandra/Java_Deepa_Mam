public class EventRegistration {
    public String name;
    public String nameOfEvent;
    public double registrationFee;
    public int counter;

    EventRegistration(String name, String nameOfEvent) {
        this.name = name;
        this.nameOfEvent = nameOfEvent;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameOfEvent() {
        return this.nameOfEvent;
    }

    public void setNameOfEvent(String nameOfEvent) {
        this.nameOfEvent = nameOfEvent;
    }

    public double getRegistrationFee() {
        return registrationFee;
    }

    public void setRegistrationFee(double registrationFee) {
        this.registrationFee = registrationFee;
    }

    public void registerEvent() {
        if (this.nameOfEvent == "ShakeALeg") {
            this.registrationFee = 100.0;
        } else if (this.nameOfEvent == "Sing&Win") {
            this.registrationFee = 150.0;
        } else if (this.nameOfEvent == "Actathon") {
            this.registrationFee = 70.0;
        } else if (this.nameOfEvent == "PlayAway") {
            this.registrationFee = 130.0;
        }else{
            System.out.println("Please choose a valid event.");
            this.counter=-1;
            return;
        }
}

}