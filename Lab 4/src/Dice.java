import java.util.Random;

public class Dice {
    private Random random;
    private int numberOfSides;

    public Dice(int numberOfSides) {
        this.numberOfSides = numberOfSides;  //2 constructors, in this one we passing integer value
        random = new Random();

        System.out.println("hello ");
    }

    public int roll(){
        return random.nextInt(this.numberOfSides) + 1;

    }
    public String toString(){
        return "Number of sides = " + this.numberOfSides;   //if we dont call any method this mehod is gonna be executed
    }
}

