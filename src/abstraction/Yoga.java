package abstraction;

public class Yoga extends Workout{

    public Yoga(int duration) {
        super(duration);

    }
    @Override
    public void caloriesBurnt() {
        int caloriesBurnt = duration * 3;
        System.out.println("Yoga burned " + caloriesBurnt + " calories");
    }
}
