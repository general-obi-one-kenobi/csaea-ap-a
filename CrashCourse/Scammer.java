package CrashCourse;

public class Scammer {
    String characterName;
    String ethnicity;
    String gender;
    int health;
    double money;
    int wantedLevel;
    boolean inJail;
    String weapon;
    String carType;
    int businessPartners;
    int houseLevel;   //acts as a level up system

    public Scammer(String characterName, String ethnicity, String gender) {
        this.characterName = characterName;
        this.ethnicity = ethnicity;
        this.gender = gender;

        health = 100;
        money = 100.0;
        wantedLevel = 0;
        inJail = false;
        carType = basic;
        businessPartners = 0;
        houseLevel = 1;

    }

    public void scamCall() {
        money += 25.0;
        wantedLevel += 1;
        if (wantedLevel >= 5) {
            inJail = true;
            System.out.println("You got arrested.");
    }

    public void makeDeal() {
        businessPartners += 1;
        money += 50.0;
    }
    
    public void sellValuables() {
        money += 100.0;
    }

    public void evadeTaxes() {
        wantedLevel += 1;
        if (wantedLevel >= 5) {
            inJail = true;
            System.out.println("You got arrested.");
        }
    }

        public void takeDamage(int amount) {
        health -= amount;
        if (health < 0) {
            System.out.println("You died.");
        }
    }

    public void attackPlayer() {
        wantedLevel += 1;
            if (wantedLevel >= 5) {
                inJail = true;
                System.out.println("You got arrested.");

    }
    
}
