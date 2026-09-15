package CrashCourse;

public class Dog {
    String name;
    String ownerName;
    String breed;
    int age;
    double weight;
    boolean isHungry;
    boolean isHome;
    int energyLevel;

    public Dog(String name, String ownerName, String breed) {
        this.name = name;
        this.ownerName = ownerName;
        this.breed = breed;

        age = 1;
        weight = 25.0;
        isHungry = false;
        isHome = true;
        energyLevel = 100;

    }

    public void bark() {
        System.out.println(name + " barked at you.");

    }
    
    public void scratch() {
        System.out.println(name + " scratched you.");

    }

    public void bite() {
        System.out.println(name + " bit you.");

    }

    public void eat() {
        isHungry = false;
        weight ++;

    }

    public void runAway() {
        isHome =  false;
        energyLevel -= 25;

    }

}
