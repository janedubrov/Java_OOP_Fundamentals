package abstraction;

public class Test {
    public static void main(String[] args) {
        Workout run = new Running(10);
        Workout yoga = new Yoga(9);

        run.caloriesBurnt();
        yoga.caloriesBurnt();


    }

}
