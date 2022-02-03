package course1.lesson6.homework6;

public class AnimalApp {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];
        Cat[] cats = new Cat[3];

        dogs[0] = new Dog("Beasty", 420, 12);
        dogs[1] = new Dog("Chappy", 200, 4);
        dogs[2] = new Dog("Spike", 600, 7);

        for (Dog i : dogs) {
            i.dogRunning();
            i.dogSwimming();
            System.out.println();

        }
        cats[0] = new Cat("Grace", 180, 5);
        cats[1] = new Cat("Sherlok", 80, 9);
        cats[2] = new Cat("Milky", 120, 0);

        for (Cat i : cats) {
            i.catRunning();
            i.catSwimming();
            System.out.println();

        }
    }
}
