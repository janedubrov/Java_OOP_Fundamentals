package abstraction;

public class Running extends Workout{

    public Running (int duration) {
        super(duration);
    }

    @Override
    public void caloriesBurnt() {
        int caloriesBurnt = duration * 10;
        System.out.println("Running burned " + caloriesBurnt + " calories");
    }

}
