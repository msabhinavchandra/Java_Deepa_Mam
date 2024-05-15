class Test {

    public static void main(String[] args) {
        SingleEventRegistration Jenny = new SingleEventRegistration("Jenny", "Sing&Win", 1);
        // Jenny.registerEvent();

        // Output:
        // Thank You Jenny for your participation.Your registration fee is: 150.0
        // You are participant no: 1

        // SingleEventRegistration Hudson = new SingleEventRegistration("Hudson",
        // "PlayAway", 2);
        // Hudson.registerEvent();

        // output:
        // Thank You Hudson for your participation.Your registration fee is: 130.0
        // You are participant no: 2

        // TeamEventRegistration Aura = new TeamEventRegistration("Aura", "ShakeALeg",
        // 5, 1);
        // Aura.registerEvent();
        // output:
        // Thank You Aura for your participation.Your registration fee is: 250.0
        // Your team no: 1
        // SingleEventRegistration Hudson = new SingleEventRegistration("Hudson",
        // "PlaAway", 2);
        // Hudson.registerEvent();
        // output:
        // Please choose a valid event.

        TeamEventRegistration Aura = new TeamEventRegistration("Aura", "ShakeALe", 5, 1);
        Aura.registerEvent();
        // output:
        // Please choose a valid event.

    }
}
