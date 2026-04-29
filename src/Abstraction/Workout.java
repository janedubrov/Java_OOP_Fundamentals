package Abstraction;

public abstract class Workout {
    int duration;

    public Workout(int duration) {
        this.duration = duration;

    }

    public abstract void caloriesBurnt();

    void start() {
        System.out.println("Starting workout for " + duration + " minutes");
    }

}
