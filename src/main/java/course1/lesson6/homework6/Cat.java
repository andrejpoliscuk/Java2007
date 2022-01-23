package course1.lesson6.homework6;

public class Cat extends Animal {

    public Cat(String name, int runDistance, int swimDistance) {
        super(name, runDistance, swimDistance);
    }
    public void catRunning () {
        if (this.runDistance < 0 || this.runDistance > 200) {
            System.out.println("Cat " + this.name + " can't run " + runDistance + " m distance");
        }
        else {
            System.out.println("Cat " + this.name + " has run " + this.runDistance + " m");
        }
    }
    public void catSwimming () {
            System.out.println("Cats can't swim!");
        }
    }
