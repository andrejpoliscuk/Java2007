package course1.lesson6.homework6;

public class Dog extends Animal {

    public Dog (String name, int runDistance, int swimDistance) {
        super(name, runDistance, swimDistance);
    }
    public void dogRunning () {
        if (this.runDistance < 0 || this.runDistance > 500) {
            System.out.println("Dog " + this.name + " can't run " + this.runDistance + " m");
        }
        else {
            System.out.println("Dog " + this.name + " has run " + this.runDistance + " m");
        }
    }
    public void dogSwimming () {
        if (this.swimDistance < 0 || this.swimDistance > 10) {
        System.out.println("Dog " + this.name + " can't swim " + this.swimDistance + " m");
    }
    else {
        System.out.println("Dog " + this.name + " has swum " + this.swimDistance + " m");
    }

    }
}
