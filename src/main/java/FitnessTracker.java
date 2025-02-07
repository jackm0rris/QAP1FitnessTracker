import java.util.ArrayList;
import java.util.List;

public class FitnessTracker {
    private List<Workout> workouts;
    private int fitnessGoal; // in calories

    public FitnessTracker() {
        workouts = new ArrayList<>();
        fitnessGoal = 0; // default goal
    }

    public void logWorkout(String type, int duration) {
        workouts.add(new Workout(type, duration)); // adding new workout to the list
    }

    public int getTotalCaloriesBurned() {
        int total = 0;
        for (Workout w : workouts) {
            total += w.getCaloriesBurned(); // adding up calories
        }
        return total;
    }

    public void setFitnessGoal(int goal) {
        this.fitnessGoal = goal;
    }

    public int getFitnessGoal() {
        return fitnessGoal;
    }

    // add this method to return the list of workouts
    public List<Workout> getWorkouts() {
        return workouts;
    }

    public void printWorkouts() {
        System.out.println("Workout Log:");
        for (Workout w : workouts) {
            System.out.println(w.getWorkoutType() + " for " + w.getDuration() + " min - burned " + w.getCaloriesBurned() + " cals");
        }
    }

    public static void main(String[] args) {
        FitnessTracker tracker = new FitnessTracker();

        tracker.logWorkout("Weight Lifting", 15);
        tracker.logWorkout("Hockey", 30);
        tracker.logWorkout("Running", 45);

        tracker.setFitnessGoal(700);

        tracker.printWorkouts();
        System.out.println("Total Cals Burned: " + tracker.getTotalCaloriesBurned());
        System.out.println("Goal: " + tracker.getFitnessGoal());

        if (tracker.getTotalCaloriesBurned() >= tracker.getFitnessGoal()) {
            System.out.println("You reached your goal!");
        } else {
            System.out.println("You need " + (tracker.getFitnessGoal() - tracker.getTotalCaloriesBurned()) + " more calories to reach your goal!.");
        }
    }
}
